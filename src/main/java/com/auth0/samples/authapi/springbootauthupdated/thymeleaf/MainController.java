package com.auth0.samples.authapi.springbootauthupdated.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

  @GetMapping("/users/sign-up")
  public String showSignUp() {
    return "main";
  }
}
