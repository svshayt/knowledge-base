package com.svshayt.knowledge.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriUtils;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@RestController
public class URLController {

    @GetMapping("/api/url/encode")
    public String encodeToURL(@RequestParam String input) {
        // Преобразуем строку в URL-кодированный формат
        return URLEncoder.encode(input, StandardCharsets.UTF_8);
    }

    @GetMapping("/api/url/v2/encode")
    public String encodeFromSpringToURL(@RequestParam String input) {
        // Преобразуем строку в URL-кодированный формат
        return UriUtils.encode(input, StandardCharsets.UTF_8);
    }
}
