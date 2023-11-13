package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SituationListController {
    @GetMapping("/SituationList")
    static String situationList(){
        return "SituationList";
    }
}
