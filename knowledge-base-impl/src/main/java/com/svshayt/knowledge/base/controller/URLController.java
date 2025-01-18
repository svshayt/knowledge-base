package com.svshayt.knowledge.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriUtils;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/api/url")
public class URLController {

    @GetMapping("/encode")
    public String encodeToURL(@RequestParam String input) {
        // Преобразуем строку в URL-кодированный формат
        return URLEncoder.encode(input, StandardCharsets.UTF_8);
    }

    @GetMapping("/spring/encode")
    public String springEncodeToURL(@RequestParam String input) {
        // Преобразуем строку в URL-кодированный формат
        return UriUtils.encode(input, StandardCharsets.UTF_8);
    }
}
