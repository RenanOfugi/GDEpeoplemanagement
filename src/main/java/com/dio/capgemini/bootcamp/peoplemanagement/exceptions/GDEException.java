package com.dio.capgemini.bootcamp.peoplemanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GDEException extends RuntimeException {
    public GDEException(String message) {
        super(message);
    }
}
