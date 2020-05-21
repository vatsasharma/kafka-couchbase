package com.sharma.poc.kafka.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.sharma.poc.kafka.model.User;

@Repository
public interface UserRepository extends CouchbaseRepository<User, String> {

}
