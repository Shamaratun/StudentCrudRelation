package org.isdb.StudentCrudRelation.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({IllegalArgumentException.class,IllegalStateException.class})
    protected ResponseEntity<Object> handleBadRequest(RuntimeException ex, WebRequest request) {
        return buildErrorResponse(ex,  HttpStatus.BAD_REQUEST, request);
                    }
         
                    @ExceptionHandler(Exception.class)
            protected ResponseEntity<Object> handleConflict(Exception ex, WebRequest request) {
                return buildErrorResponse(ex,  HttpStatus.INTERNAL_SERVER_ERROR, request);
            }
        
            private ResponseEntity<Object> buildErrorResponse(Exception ex, HttpStatus badRequest, WebRequest request) {
                           Map<String, Object> body = new LinkedHashMap<>();
                           body.put("timestamp", System.currentTimeMillis());
                           body.put("status", badRequest.value());
                           body.put("error", ex.getMessage());
                           
                           body.put("message", ex.getMessage());
               body.put("path", request.getDescription(false));
               return new ResponseEntity<>(body, badRequest);
            }  
             


}
