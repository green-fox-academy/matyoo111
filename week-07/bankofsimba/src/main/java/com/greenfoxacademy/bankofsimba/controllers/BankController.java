package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankController {

  List<BankAccount> accounts;

  public BankController() {
    //accounts = new ArrayList<>();
  }



  @GetMapping("")
  public String showAccount(Model model) {
    accounts = Arrays.asList(
            new BankAccount("Simba", 2000, "Lion"),
            new BankAccount("Nala", 300, "Lion"),
            new BankAccount("Rafiki", 100, "Monkey"),
            new BankAccount("Gopher", 800, "Gopher"),
            new BankAccount("Speedy", 500, "Snail")
    );

    model.addAttribute("bankaccounts", accounts);
    return "index";
  }

  @GetMapping("/registration")
  public String trial(Model model){
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "registration";
  }
}
