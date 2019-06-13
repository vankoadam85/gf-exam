package com.greenfox.orientation_exam.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(OrderNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public String resourceNotFound() {
    return "notFound";
  }

  @ExceptionHandler(InvalidQueryException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public void invalidQuery() {

  }

}
