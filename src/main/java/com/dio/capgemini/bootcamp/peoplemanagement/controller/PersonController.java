package com.dio.capgemini.bootcamp.peoplemanagement.controller;

import com.dio.capgemini.bootcamp.peoplemanagement.dto.response.MessageResponseDTO;
import com.dio.capgemini.bootcamp.peoplemanagement.entity.PersonGDE;
import com.dio.capgemini.bootcamp.peoplemanagement.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody PersonGDE person) {
        PersonGDE personGDESave = personRepository.save(person);
        return MessageResponseDTO.builder().message("GDE " + personGDESave.getId() + ": Criado com sucesso").build();
    }

}
