package com.dio.capgemini.bootcamp.peoplemanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    void handleFoo(HttpServletResponse response, HttpServletRequest request) throws IOException {
        String baseUrl = ServletUriComponentsBuilder
                .fromRequestUri(request)
                .replacePath(null)
                .build()
                .toUriString();

        response.sendRedirect(baseUrl + "/api/v1/people");
    }
}
