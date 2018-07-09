package com.greenfoxacademy.rest_practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @GetMapping("")
  public String renderIndex() {
    return "index";
  }

}
