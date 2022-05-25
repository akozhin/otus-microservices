package dev.akozhin.otus.microservices.userservice;

import dev.akozhin.otus.microservices.userservice.domain.User;
import dev.akozhin.otus.microservices.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class UserServiceApplication implements ApplicationListener<ApplicationReadyEvent> {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        if(userRepository.count() == 0 ){
            userRepository.save(new User(null, "akozhin", "Alexandr", "Kozhin", "alexandr.kozhin@gmail.com", "123456789"));
        }
    }
}


