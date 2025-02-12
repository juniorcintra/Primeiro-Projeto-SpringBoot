package br.com.juniorcintra.primeiro_projeto_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PrimeiraController {

  @GetMapping
  public String hello() {
    return "Hello World!";
  }
}

