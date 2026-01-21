package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.Enum.AlertTypeEnum;
import ink.yowyob.geofence.dto.response.AlertDTO;
import ink.yowyob.geofence.dto.response.AlertListResponse;
import ink.yowyob.geofence.mapper.AlertDTOMapper;
import ink.yowyob.geofence.model.Alert;
import ink.yowyob.geofence.model.AlertType;
import ink.yowyob.geofence.model.GeofenceZone;
import ink.yowyob.geofence.model.Location;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.model.Vehicle;
import ink.yowyob.geofence.repository.AlertRepository;
import ink.yowyob.geofence.repository.AlertTypeRepository;
import ink.yowyob.geofence.repository.LocationRepository;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.repository.VehicleRepository;
import ink.yowyob.geofence.service.AlertService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class AlertServiceImpl implements AlertService {
    private final AlertRepository alertRepository;
    private final AlertTypeRepository alertTypeRepository;
    private final UserRepository userRepository;
    private final VehicleRepository vehicleRepository;
    private final LocationRepository locationRepository;
    private final AlertDTOMapper alertDTOMapper;
    private final SimpMessagingTemplate messagingTemplate;

    @Override
    @Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRES_NEW)
    public AlertDTO createAlert(Vehicle vehicle, GeofenceZone zone, AlertTypeEnum alertType, Location location, String message) {
        // Find or create the alert type
        AlertType type = alertTypeRepository.findByType(alertType)
                .orElseGet(() -> {
                    AlertType newType = new AlertType();
                    newType.setType(alertType);
                    return alertTypeRepository.save(newType);
                });

        // Create the alert
        Alert alert = new Alert();
        alert.setType(type);
        alert.setVehicle(vehicle);
        alert.setGeofenceZone(zone);
        alert.setLocation(location);
        alert.setMessage(message);
        alert.setTimestamp(LocalDateTime.now());

        // Save the alert
        Alert savedAlert = alertRepository.save(alert);

        // Convert to DTO
        AlertDTO alertDTO = alertDTOMapper.apply(savedAlert);

        // Send real-time notification via WebSocket
        messagingTemplate.convertAndSendToUser(
                vehicle.getUser().getUsername(),
                "/queue/alerts",
                alertDTO
        );

        return alertDTO;
    }

    @Override
    public AlertListResponse getMyAlerts(Integer page, Integer size, User user) {

        // Get all vehicles belonging to the user
        List<Vehicle> userVehicles = vehicleRepository.findByUser(user);

        // Fetch alerts for these vehicles
        List<Alert> alerts = alertRepository.findByVehicleInOrderByTimestampDesc(userVehicles);

        List<AlertDTO> alertDTOs = alerts.stream()
                .map(alertDTOMapper)
                .collect(Collectors.toList());

        return new AlertListResponse(alertDTOs, alertDTOs.size());
    }

    @Override
    public AlertListResponse getAllAlerts(Integer page, Integer size) {
        List<Alert> alerts = alertRepository.findAllByOrderByTimestampDesc();

        List<AlertDTO> alertDTOs = alerts.stream()
                .map(alertDTOMapper)
                .collect(Collectors.toList());

        return new AlertListResponse(alertDTOs, alertDTOs.size());
    }

    @Override
    public AlertDTO getAlert(UUID id) {
        Alert alert = alertRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Alert with id " + id + " does not exist"));

        return alertDTOMapper.apply(alert);
    }
}