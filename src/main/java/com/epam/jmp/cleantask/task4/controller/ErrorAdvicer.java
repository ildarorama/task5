package com.epam.jmp.cleantask.task4.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.SQLException;

@ControllerAdvice
public class ErrorAdvicer extends ResponseEntityExceptionHandler {

        @ExceptionHandler(value = SQLException.class)
        protected ResponseEntity<Object> sqlException(
                RuntimeException ex, WebRequest request) {
            String bodyOfResponse = "SQL exception occurred: " + ex.getMessage();
            return handleExceptionInternal(ex, bodyOfResponse,
                    new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
        }

    @ExceptionHandler(value = ArithmeticException.class)
    protected ResponseEntity<Object> mathException(
            RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "Arithmetic exception occurred: " + ex.getMessage();
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), HttpStatus.SWITCHING_PROTOCOLS, request);
    }
}
