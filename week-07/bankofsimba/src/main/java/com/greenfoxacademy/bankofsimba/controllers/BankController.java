package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.models.trial;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class BankController {

  public static List<BankAccount> accounts;
  static List<trial> trials;


  public BankController() {
    accounts = Arrays.asList(
            new BankAccount("Simba", 2000, "Lion", true, true),
            new BankAccount("Nala", 300, "Lion", false, true),
            new BankAccount("Rafiki", 100, "Monkey", false, false),
            new BankAccount("Gopher", 800, "Gopher", false, false),
            new BankAccount("Speedy", 500, "Snail", false, true)
    );

    trials = Arrays.asList(
            new trial("Simba", 2000, "Lion"),
            new trial("Nala", 300, "Lion"),
            new trial("Rafiki", 100, "Monkey")
    );

  }



  @GetMapping("")
  public String showAccount(Model model) {
    model.addAttribute("bankaccounts", accounts);
    return "index";
  }

  @GetMapping("/alma")
  public String addMoney(@RequestParam String name, Model model) {
    for (BankAccount account : accounts) {
      if (account.getName().equals(name) && !(account.isKing())) {
        account.setBalance(account.getBalance() + 10);
      } else if (account.getName().equals(name) && account.isKing()) {
        account.setBalance(account.getBalance() + 100);
      }
    }
    model.addAttribute("bankaccounts", accounts);
    return "index";
  }

  @GetMapping("/registration")
  public String showAcc(Model model) {
    model.addAttribute("newAccount", new trial());
    return "registration";
  }

  @PostMapping("/registration")
  public String register(@ModelAttribute trial example) {

    trials.add(example);
    return "redirect:/";
  }
}
