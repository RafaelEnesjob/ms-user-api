package com.ms.userApi.exceptions.handlers;

import com.ms.userApi.exceptions.CpfExistenteException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CpfExistenteException.class)
    public ResponseEntity<RestErrorMessage> handleCpfExistenteException (CpfExistenteException ex) {
        RestErrorMessage erroResponse = new RestErrorMessage(HttpStatus.CONFLICT, ex.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(erroResponse);
    }
}
