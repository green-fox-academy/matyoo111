package com.greenfoxacademy.connection_with_mysql.controllers;

import com.greenfoxacademy.connection_with_mysql.models.Assignee;
import com.greenfoxacademy.connection_with_mysql.models.ToDo;
import com.greenfoxacademy.connection_with_mysql.repositories.AssigneeRepository;
import com.greenfoxacademy.connection_with_mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AssigneeController {

  AssigneeRepository assigneeRepository;
  ToDoRepository toDoRepository;

  @Autowired
  public AssigneeController(AssigneeRepository assigneeRepository, ToDoRepository toDoRepository) {
    this.assigneeRepository = assigneeRepository;
    this.toDoRepository = toDoRepository;
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

  @GetMapping("/{id}/editassignee")
  public String renderEditAssigneePage(Model model, @PathVariable("id") long id) {
    model.addAttribute("assignee", assigneeRepository.findById(id).get());
    return "editassignee";
  }


  @PostMapping("/{id}/editassignee")
  public String editAssignee(@PathVariable("id") long id,
                             @RequestParam(value = "name", required = false) String name,
                             @RequestParam(value = "email", required = false) String email) {
    if (name != null && !(name.equals(""))) {
      assigneeRepository.findById(id).get().setName(name);
      assigneeRepository.save(assigneeRepository.findById(id).get());
    }
    if(email != null && !(email.equals(""))) {
      assigneeRepository.findById(id).get().setEmail(email);
      assigneeRepository.save(assigneeRepository.findById(id).get());
    }

    return "redirect:/assignee";
  }



  @PostMapping("/{id}/deleteassignee")
  public String removeAssignee(@PathVariable("id") long id) {
    assigneeRepository.deleteById(id);
    return "redirect:/assignee";
  }

}
