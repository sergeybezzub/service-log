package com.bsv.servicelog.controller;

import org.springframework.http.ResponseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
@Slf4j
public class ExceptionHandlerAdvice {


    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleUnknownExceptions(Throwable t) {
        log.error(t.toString());
        log.error("UnknownException occurred: ", t);
        return ResponseEntity
                .status(INTERNAL_SERVER_ERROR)
                .body(t.getMessage());
    }
}
