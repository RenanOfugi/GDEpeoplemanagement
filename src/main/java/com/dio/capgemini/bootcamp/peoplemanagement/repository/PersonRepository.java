package com.dio.capgemini.bootcamp.peoplemanagement.repository;

import com.dio.capgemini.bootcamp.peoplemanagement.entity.PersonGDE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonGDE, Long> {
}
