package dev.akozhin.otus.microservices.userservice.repository;

import dev.akozhin.otus.microservices.userservice.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}