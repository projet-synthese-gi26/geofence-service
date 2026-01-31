package ink.yowyob.geofence.util;

/**
 * Petit utilitaire pour parser des représentations courantes de jours (flexible):
 * exemples acceptés: "MON", "Mon", "MONDAY", "Monday", "Lundi", "1" (1 = Monday)
 */
public final class DayOfWeekParser {
    private DayOfWeekParser() {}

    public static java.time.DayOfWeek parseToJavaDayOfWeek(String input) {
        return ink.yowyob.geofence.Enum.DayOfWeek.parse(input).toJavaDayOfWeek();
    }
}
