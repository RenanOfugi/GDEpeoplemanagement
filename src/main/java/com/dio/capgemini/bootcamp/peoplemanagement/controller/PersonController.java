package com.dio.capgemini.bootcamp.peoplemanagement.controller;

import com.dio.capgemini.bootcamp.peoplemanagement.dto.response.MessageResponseDTO;
import com.dio.capgemini.bootcamp.peoplemanagement.entity.PersonGDE;
import com.dio.capgemini.bootcamp.peoplemanagement.repository.PersonRepository;
import com.dio.capgemini.bootcamp.peoplemanagement.service.PersonGDEService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    PersonGDEService personGDEService;

    PersonController(PersonGDEService personGDEService){
        this.personGDEService = personGDEService;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody PersonGDE person) {
        return personGDEService.createPerson(person);    
    }

}
