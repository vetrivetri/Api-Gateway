package com.api.gateway.api.gateway.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class GatewayExceptionHandler extends ResponseEntityExceptionHandler {

    //private static final Logger logger = LoggerFactory.getLogger(GatewayExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity handleException(HttpServletRequest request, Exception ex){

            Map<String, Object> body = new LinkedHashMap<>();
            body.put("timestamp", LocalDateTime.now());
            body.put("message", "ExceptionOccured");

            return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
        }
    }

