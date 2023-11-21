package com.prep.prep.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.prep.prep.core.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
