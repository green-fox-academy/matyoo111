package com.greenfoxacademy.connection_with_mysql.controllers;

import com.greenfoxacademy.connection_with_mysql.models.Assignee;
import com.greenfoxacademy.connection_with_mysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AssigneeController {

  AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeController(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @GetMapping("/assignee")
  public String renderAssigneePage(Model model) {
    model.addAttribute("assignees", assigneeRepository.findAll());
    model.addAttribute("new_assignee", new Assignee());
    return "assignee";
  }



  @PostMapping("/assignee")
  public String addAssignee(@ModelAttribute("assignee") Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/assignee";
  }

  @PostMapping("/assignee/edit")
  public String editAssignee(@ModelAttribute("assignee") Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/assignee";
  }

  /*
  @PostMapping("/{id}/delete")
  public String removeAssignee(@PathVariable("id") long id) {
    assigneeRepository.deleteById(id);
    return "redirect:/assignee";
  }
  */
}
