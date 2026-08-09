package com.q1.profile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @GetMapping("/profile/1")
    public String getProfile() {
        return "Profile service working";
    }
}