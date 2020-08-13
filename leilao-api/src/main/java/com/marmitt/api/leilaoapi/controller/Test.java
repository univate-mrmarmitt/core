package com.marmitt.api.leilaoapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

  @Value("${application-leilao-api}")
  private boolean configDevelop;

  @Value("${application-main}")
  private boolean applicationMain;

  @GetMapping(value = "/whoami/{username}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String whoami(@PathVariable("username") String username) {
        return String.format("Hello! You're %s and you'll become a(n) %s and %s...\n", username, configDevelop, applicationMain);
    }
}