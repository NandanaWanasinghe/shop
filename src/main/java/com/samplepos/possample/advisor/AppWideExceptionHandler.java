package com.samplepos.possample.advisor;

import com.samplepos.possample.Exception.NotFoundException;
import com.samplepos.possample.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<StandardResponse>handlerNotFoundException(NotFoundException e){
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(404, "ERROR",e.getMessage()),
                HttpStatus.NOT_FOUND
        );
    }
}
