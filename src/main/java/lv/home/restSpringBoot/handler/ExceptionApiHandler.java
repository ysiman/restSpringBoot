package lv.home.restSpringBoot.handler;

import lv.home.restSpringBoot.exception.DemoException;
import lv.home.restSpringBoot.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionApiHandler {
/*
          Если надо вернуть HTTP код 200, HTTP а статус - NOT_FOUND то делаем так
     */
//    @ExceptionHandler(DemoException.class)
//    public ResponseEntity<String> handleException(DemoException exception) {
//        return ResponseEntity
//                .status(HttpStatus.NOT_FOUND)
//                .body("#DemoError.");
//    }


    /*
          Если надо вернуть HTTP код 400 - NOT_FOUND то делаем так
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(DemoException.class)
    public ErrorMessage handleException(DemoException exception) {
        return new ErrorMessage("#rte");
    }

}
