package com.schoolmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoolmanager.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
