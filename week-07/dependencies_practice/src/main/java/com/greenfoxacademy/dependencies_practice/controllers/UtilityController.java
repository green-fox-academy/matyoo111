package com.greenfoxacademy.dependencies_practice.controllers;

import com.greenfoxacademy.dependencies_practice.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

  @Autowired
  private UtilityService utilityService;

  @GetMapping("useful/colored")
  public String color(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful")
  public String useful() {
    return "useful";
  }

  @GetMapping("useful/email")
  public String checkEmailValidity(@RequestParam(value="word", required=false) String email, Model model) {
    if (!(email == null)) {
      if (utilityService.validateEmail(email)) {
        model.addAttribute("valid", "Email address is valid");
        model.addAttribute("color", "green");
      } else if (!(utilityService.validateEmail(email)) && !(email==null)){
        model.addAttribute("valid", "Email address is not valid");
        model.addAttribute("color", "red");
      }
    } else if (email == null || email == ""){
      model.addAttribute("valid", "No email address is provided");
      model.addAttribute("color", "red");
    }
    return "email";
  }


  @GetMapping("/useful/caesar")
  public String ceasarify(@RequestParam(value="word", required=false) String name, @RequestParam(value="number", required=false) String number, Model model) {
    if (!(name == null)) {
      int numberToShift = Integer.parseInt(number);
      model.addAttribute("word", utilityService.caesar(name, numberToShift));
    } else {
      model.addAttribute("word", "Could not convert text");
    }
    return "caesar";
  }



}
