package com.example.mc_front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/sign-up")
    public String signUp() {
        return "signup";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/sign-up-completed")
    public String signUpCompleted() {
        return "signup_completed";
    }

    @GetMapping("/mbti-record")
    public String mbtiRecord() {
        return "mbti_record";
    }

    @GetMapping("/mbti-latest")
    public String mbtiLatest() {
        return "mbti_latest";
    }

    @GetMapping("/mbti-chart")
    public String mbtiChart() {
        return "mbti_chart";
    }
}
