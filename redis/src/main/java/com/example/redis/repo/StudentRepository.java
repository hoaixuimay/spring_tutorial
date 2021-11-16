/*
 * StudentRepository.java
 *
 * Copyright by Axon Ivy (Lucerne), all rights reserved.
 */
package com.example.redis.repo;

import com.example.redis.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}
