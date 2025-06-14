package com.amon.javaCrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Redirects root URL to the main tasks API.
 */
@Controller
public class RootController {

    @GetMapping("/")
    public String redirectToTasks() {
        return "redirect:/swagger-ui/index.html";
    }
}
