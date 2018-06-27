package com.greenfoxacademy.dependencies_practice.controllers;

import com.greenfoxacademy.dependencies_practice.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {

  @Autowired
  private UtilityService utilityService;

  @GetMapping("/colored")
  public String color(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }


}
