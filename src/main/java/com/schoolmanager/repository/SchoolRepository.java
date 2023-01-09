package com.schoolmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoolmanager.model.School;

@Repository
public interface SchoolRepository extends CrudRepository<School, Integer> {

}
