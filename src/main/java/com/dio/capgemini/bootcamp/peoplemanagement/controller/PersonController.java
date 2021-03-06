package com.dio.capgemini.bootcamp.peoplemanagement.controller;

import com.dio.capgemini.bootcamp.peoplemanagement.dto.request.PersonGdeDTO;
import com.dio.capgemini.bootcamp.peoplemanagement.dto.response.MessageResponseDTO;
import com.dio.capgemini.bootcamp.peoplemanagement.service.PersonGDEService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/gde")
public class PersonController {

    PersonGDEService personGDEService;

    PersonController(PersonGDEService personGDEService){
        this.personGDEService = personGDEService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createGDE(@RequestBody @Valid PersonGdeDTO gdeDTO) {
        return personGDEService.createGDE(gdeDTO);
    }

    @GetMapping
    public List<PersonGdeDTO> listAll(){
        return personGDEService.listAll();
    }

    @GetMapping("/{id}")
    public PersonGdeDTO findById(@PathVariable Long id){
        return personGDEService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteGDEById(@PathVariable Long id){
        personGDEService.deleteGDE(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateGDE(@PathVariable Long id, @RequestBody PersonGdeDTO gdeDTO){
        return personGDEService.updateGDE(id, gdeDTO);
    }

}
