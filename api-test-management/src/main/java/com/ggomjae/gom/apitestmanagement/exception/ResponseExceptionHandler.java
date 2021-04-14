package com.ggomjae.gom.apitestmanagement.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllException(Exception e, WebRequest webRequest){
        ExceptionResponse exceptionResponse =
                new ExceptionResponse(new Date(), e.getMessage(), webRequest.getDescription(false));

        return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // User Exception - 예시임
    @ExceptionHandler(UserNotExceptionResponse.class)
    public final ResponseEntity<Object> handleUserNotException(Exception e, WebRequest webRequest){
        ExceptionResponse exceptionResponse =
                new ExceptionResponse(new Date(), e.getMessage(), webRequest.getDescription(false));

        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }

    /*
        Valid
     */
    @Override // 이러한 오버라이드는 상속을 했을 경우, 만약 메소드 명이 틀리면 오류가 뜨니까 쓰는게 좋다.
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException e, HttpHeaders headers, HttpStatus status, WebRequest webRequest) {

        ExceptionResponse exceptionResponse =
                new ExceptionResponse(new Date(), "Validation Failed", e.getBindingResult().toString());

        return new ResponseEntity(exceptionResponse,HttpStatus.BAD_REQUEST);
    }
}