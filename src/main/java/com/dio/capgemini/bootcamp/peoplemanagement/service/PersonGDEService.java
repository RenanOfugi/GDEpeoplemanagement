package com.dio.capgemini.bootcamp.peoplemanagement.service;

import com.dio.capgemini.bootcamp.peoplemanagement.dto.request.PersonGdeDTO;
import com.dio.capgemini.bootcamp.peoplemanagement.dto.response.MessageResponseDTO;
import com.dio.capgemini.bootcamp.peoplemanagement.entity.PersonGDE;
import com.dio.capgemini.bootcamp.peoplemanagement.exceptions.GDEException;
import com.dio.capgemini.bootcamp.peoplemanagement.mapper.PersonGDEMapper;
import com.dio.capgemini.bootcamp.peoplemanagement.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonGDEService {
    
    private final PersonRepository personRepository;
    private final PersonGDEMapper mapper = PersonGDEMapper.INSTANCE;

    @Autowired
    PersonGDEService(PersonRepository personRepository){
        this.personRepository = personRepository; 
    }

    public MessageResponseDTO createPerson(PersonGdeDTO gdeDTO) {
        PersonGDE person = mapper.toModel(gdeDTO);
        PersonGDE personGDESave = personRepository.save(person);
        return MessageResponseDTO.builder().message("GDE " + personGDESave.getId() + ": Criado com sucesso").build();
    }

    public List<PersonGdeDTO> listAll() {
        List<PersonGDE> personGDEList = personRepository.findAll();
        return personGDEList.stream().map(mapper::toDTO).collect(Collectors.toList());
    }

    public PersonGdeDTO findById(Long id) {
        Optional<PersonGDE> gdeOptional = personRepository.findById(id);
        if(gdeOptional.isPresent()){
            return mapper.toDTO(gdeOptional.get());
        } else {
            throw new GDEException("GDE's ID not found");
        }
    }
}
