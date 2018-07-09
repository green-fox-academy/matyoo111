package com.greenfoxacademy.rest_practice.controllers;

import com.greenfoxacademy.rest_practice.models.*;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public Object doubleNumber(@RequestParam(value = "input", required = false) Integer number) {
    if (number != null) {
      return new Doubling(number, number * 2);
    } else {
      return new ErrorHandling("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Object greet(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false)String title) {
    if (name != null && title != null) {
      return new Greeter(name, title);
    } else if (name == null){
      return new ErrorHandling("Please provide a name!");
    } else if (title == null) {
      return new ErrorHandling("Please provide a title!");
    } else {
      return new ErrorHandling("Please provide a name and a title!");
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable("appendable") String appendable) {
    return new Append(appendable);
  }

  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable("what") String operation, @RequestBody(required = false) DoUntil doUntil) {
    if (operation != null && doUntil != null) {
      return new Operation(doUntil.getUntil(), operation);
    } else if (doUntil == null){
      return new ErrorHandling("Please provide a number!");
    } else if (operation == null) {
      return new ErrorHandling("Please provide a what!");
    } else {
      return new ErrorHandling("Please provide a number and a what!");
    }
  }

  @PostMapping("/arrays")
  public Object manipulateArrays(@RequestBody(required = false) Arrays arrays) {
    if (arrays != null) {
    if (arrays.getWhat().equals("sum")) {
      return new Operation(arrays.getNumbers(), arrays.getWhat());
    } else if (arrays.getWhat().equals("multiply")) {
      return new Operation(arrays.getNumbers(), arrays.getWhat());
    } else if (arrays.getWhat().equals("double")) {
      return new ArrayOperation(arrays.getNumbers());
    }
    } else {
      return new ErrorHandling("Please provide (a) number(s) and/or an operation!");
    }
    return null;
  }
}
