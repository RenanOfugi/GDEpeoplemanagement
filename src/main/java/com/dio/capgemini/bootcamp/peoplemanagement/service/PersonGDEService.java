package com.dio.capgemini.bootcamp.peoplemanagement.service;

import com.dio.capgemini.bootcamp.peoplemanagement.dto.response.MessageResponseDTO;
import com.dio.capgemini.bootcamp.peoplemanagement.entity.PersonGDE;
import com.dio.capgemini.bootcamp.peoplemanagement.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonGDEService {
    
    private final PersonRepository personRepository;

    @Autowired
    PersonGDEService(PersonRepository personRepository){
        this.personRepository = personRepository; 
    }

    public MessageResponseDTO createPerson(PersonGDE person) {
        PersonGDE personGDESave = personRepository.save(person);
        return MessageResponseDTO.builder().message("GDE " + personGDESave.getId() + ": Criado com sucesso").build();
    }

}
