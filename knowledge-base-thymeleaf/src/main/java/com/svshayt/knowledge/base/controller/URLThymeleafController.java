package com.svshayt.knowledge.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Controller
public class URLThymeleafController {

    @GetMapping("/thymeleaf/url/encode")
    public String encodeToURL(@RequestParam(required = false) String input, Model model) {
        String encodedResult = null;

        if (input != null && !input.isBlank()) {
            encodedResult = URLEncoder.encode(input, StandardCharsets.UTF_8);
        }

        model.addAttribute("originalInput", input);
        model.addAttribute("encodedResult", encodedResult);

        return "url/url-encoder"; // Возвращаем имя Thymeleaf-шаблона
    }
}
