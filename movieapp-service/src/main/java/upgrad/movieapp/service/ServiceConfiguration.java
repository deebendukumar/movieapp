package upgrad.movieapp.service;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("upgrad.movieapp.service")
@EntityScan({"upgrad.movieapp.service.user.entity"})
public class ServiceConfiguration {
}