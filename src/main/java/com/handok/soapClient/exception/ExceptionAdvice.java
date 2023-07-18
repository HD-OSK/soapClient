package com.handok.soapClient.exception;

import com.handok.soapClient.dto.response.ResponsePayloadDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    protected ResponseEntity<?> handleConverterErrors(HttpServletRequest request, RuntimeException exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                ResponsePayloadDto.builder()
                        .rCode("F")
                        .rMessage(exception.getMessage())
                        .build()
        );
    }
}
