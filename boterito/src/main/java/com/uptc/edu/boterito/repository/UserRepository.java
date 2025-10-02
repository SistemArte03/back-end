package com.uptc.edu.boterito.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.uptc.edu.boterito.model.User;



@Repository
public interface UserRepository extends MongoRepository<User,String>, UserRepositoryCustom{
    User findByEmail(String email);
    
}
