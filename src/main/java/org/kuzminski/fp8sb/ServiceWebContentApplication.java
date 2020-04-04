package org.kuzminski.fp8sb;

import org.kuzminski.fp8sb.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication (scanBasePackages = "org.kuzminski")
@EnableSwagger2WebMvc
@EnableJpaRepositories
@Import(SwaggerConfig.class)
public class ServiceWebContentApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ServiceWebContentApplication.class, args);
    }
}
