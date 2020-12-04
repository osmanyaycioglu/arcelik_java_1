package com.training.arcelik.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PersonRestAdvice {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handleIllegalArgumentException(final IllegalArgumentException exp) {
        return new ErrorObj(exp.getMessage(),
                            100);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorObj> handleIllegalArgumentException(final MethodArgumentNotValidException exp) {
        List<ObjectError> allErrorsLoc = exp.getBindingResult()
                                            .getAllErrors();
        StringBuilder sb = new StringBuilder(100);
        for (ObjectError objectErrorLoc : allErrorsLoc) {
            sb.append("Error : \n");
            sb.append(objectErrorLoc);
            sb.append("\n\n");
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                             .header("Content-Type",
                                     "application/json")
                             .body(new ErrorObj(sb.toString(),
                                                100));
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorObj handleException(final Exception exp) {
        return new ErrorObj(exp.getMessage(),
                            102);
    }


}
