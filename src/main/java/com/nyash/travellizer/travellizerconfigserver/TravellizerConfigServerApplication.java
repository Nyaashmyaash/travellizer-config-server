package com.nyash.travellizer.travellizerconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TravellizerConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravellizerConfigServerApplication.class, args);
    }

}
