package com.dio.capgemini.bootcamp.peoplemanagement.controller;

import com.dio.capgemini.bootcamp.peoplemanagement.dto.request.PersonGdeDTO;
import com.dio.capgemini.bootcamp.peoplemanagement.dto.response.MessageResponseDTO;
import com.dio.capgemini.bootcamp.peoplemanagement.service.PersonGDEService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    PersonGDEService personGDEService;

    PersonController(PersonGDEService personGDEService){
        this.personGDEService = personGDEService;
    }

    @RequestMapping("/")
    void handleFoo(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://gde-people-management.herokuapp.com/api/v1/people");
    }

    @GetMapping
    public String getMessage(){
        return "Ainda em manutenção";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonGdeDTO gdeDTO) {
        return personGDEService.createPerson(gdeDTO);
    }

}
