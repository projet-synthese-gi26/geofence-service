package ink.yowyob.geofence.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import java.net.URI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class DocumentationController {

    @GetMapping("/")
    public Mono<ResponseEntity<Void>> redirectRoot() {
        return Mono.just(ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create("/api/v1/docs/index.html"))
                .build());
    }

    @GetMapping("/api")
    public Mono<ResponseEntity<Void>> redirectApi() {
        return Mono.just(ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create("/api/v1/docs/index.html"))
                .build());
    }

    @GetMapping("/api/v1/docs")
    public Mono<ResponseEntity<Void>> redirectDocs() {
        return Mono.just(ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create("/api/v1/docs/index.html"))
                .build());
    }
}