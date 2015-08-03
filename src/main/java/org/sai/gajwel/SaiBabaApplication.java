package org.sai.gajwel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class SaiBabaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaiBabaApplication.class, args);
    }
}
