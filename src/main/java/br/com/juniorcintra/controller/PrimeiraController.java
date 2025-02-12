package br.com.juniorcintra.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PrimeiraController {

  @GetMapping("/{id}")
  public String hello(@PathVariable String id) {
    return "O id é: " + id;
  }

  @GetMapping("/metodoComQueryParams")
  public String metodoComQueryParams(@RequestParam String id) {
    return "O id da rota metodoComQueryParams é: " + id;
  }
  @GetMapping("/metodoComQueryParams2")
  public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) {
    return "O id da rota metodoComQueryParams é: " + allParams.entrySet();
  }
  
  @PostMapping("/metodoComBody")
  public String metodoComBody(@RequestBody Usuario usuario ) {
    return "O nome do usuario é: " + usuario.name();
  }

  @PostMapping("/metodoComListHeaders")
  public String metodoComBody(@RequestHeader Map<String, String> headers) {
    return "O nome do usuario é: " + headers.entrySet();
  }

  record Usuario(String id, String name) {}
}

