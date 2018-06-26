package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BankController {

  List<BankAccount> accounts;

  @GetMapping("")
  public String showAccount(Model model) {
    BankAccount account1 = new BankAccount("Simba", 2000, "Lion");
    model.addAttribute("bankaccount", account1);
    return "index";
  }
}
