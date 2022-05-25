package dev.akozhin.otus.microservices.userservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Data
@Builder
@AllArgsConstructor
public class User {
    @Id
    private String id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
