package lv.home.restSpringBoot.handler;

import lv.home.restSpringBoot.exception.DemoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionApiHandler {
    @ExceptionHandler(DemoException.class)
    public ResponseEntity<String> handleException(DemoException exception) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("#DemoError.");
    }
}
