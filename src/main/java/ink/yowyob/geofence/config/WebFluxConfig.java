package ink.yowyob.geofence.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
public class WebFluxConfig implements WebFluxConfigurer {

    @Value("${file.upload-dir:./uploads}")
    private String uploadDir;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Uploads
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:" + uploadDir + "/");

        // Documentation
        registry.addResourceHandler("/api/v1/docs/**")
                .addResourceLocations("classpath:/static/docs/", "file:docs/")
                .setCacheControl(org.springframework.http.CacheControl.noCache());

        registry.addResourceHandler("/docs/**")
                .addResourceLocations("classpath:/static/docs/", "file:docs/")
                .setCacheControl(org.springframework.http.CacheControl.noCache());
    }
}