package com.oAuth2.Auth2App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

//    @GetMapping("/")
//    public String home () {
//        return "home without login";
//    }

    @GetMapping("/secured")
    public String secured() {
        return "Secured network";
    }

    @GetMapping("/user")
    public Principal user(Principal principal) {
        System.out.println("username: " + principal.getName());
        return principal;
    }
}
