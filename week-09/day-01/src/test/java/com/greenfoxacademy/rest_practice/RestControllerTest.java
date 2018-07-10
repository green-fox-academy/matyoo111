package com.greenfoxacademy.rest_practice;

import com.greenfoxacademy.rest_practice.controllers.RestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(RestController.class)
public class RestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  // if an additional service layer is used
  // - meaning not all logic is added to the controller and you have Autowired fields in it -
  // then you have to mock out the service class like below
  //
  //@MockBean
  //private UserService userService;


  @Test
  public void doubling_succesfull() throws Exception {
    mockMvc.perform(get("/doubling")
            .param("input", "5")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.result", is(10)));
  }

  @Test
  public void doubling_missingNumber() throws Exception {
    mockMvc.perform(get("/doubling")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }

  @Test
  public void greeter_successful() throws Exception {
    mockMvc.perform(get("/greeter")
            .param("name", "Pista")
            .param("title", "student")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Pista, my dear student!")));
  }

  @Test
  public void greeter_missing_name() throws Exception {
    mockMvc.perform(get("/greeter?title=student")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a name!")));
  }

  @Test
  public void greeter_missing_title() throws Exception {
    mockMvc.perform(get("/greeter?name=Pista")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a title!")));
  }

  @Test
  public void greeter_missing_title_and_name() throws Exception {
    mockMvc.perform(get("/greeter")
            .contentType(MediaType.APPLICATION_JSON))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a name and a title!")));
  }

  @Test
  public void dountil_successful_factor() throws Exception {
    mockMvc.perform(post("/dountil/factor")
            .param("what", "factor")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": \"5\"}"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.result", is(120)));
  }

  @Test
  public void dountil_successful_sum() throws Exception {
    mockMvc.perform(post("/dountil/sum")
            .param("what", "sum")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": \"5\"}"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.result", is(15)));
  }

  @Test
  public void dountil_missing_number() throws Exception {
    mockMvc.perform(post("/dountil/sum")
            .param("what", "sum")
            .contentType(MediaType.APPLICATION_JSON))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a number!")));
  }

  @Test
  public void dountil_missing_operation() throws Exception {
    mockMvc.perform(post("/dountil")
            .param("what", "")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": \"5\"}"))
            .andExpect(status().isNotFound());
  }

  @Test
  public void dountil_wrong_operation() throws Exception {
    mockMvc.perform(post("/dountil/wrong")
            .param("what", "wrong")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": \"5\"}"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a what!")));
  }

  @Test
  public void dountil_wrong_operation_and_number() throws Exception {
    mockMvc.perform(post("/dountil/wrong")
            .param("what", "wrong")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a number and a what!")));
  }
}
