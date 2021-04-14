package com.ggomjae.gom.apitestmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotExceptionResponse extends RuntimeException {

    public UserNotExceptionResponse(String message){
        super(message);
    }
}