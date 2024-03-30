package com.guilhermeramos.nttmoviejava;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "NTT MOVIE", version = "1", description = "API desenvolvida para Academia NTT Data"))
public class NttMovieJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NttMovieJavaApplication.class, args);
    }

}
