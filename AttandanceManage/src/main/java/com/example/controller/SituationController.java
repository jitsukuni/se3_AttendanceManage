package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
public class SituationController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/Situation")
    public String situation(Model model){
        String sql = "SELECT * FROM attendances";
        System.out.println(jdbcTemplate.queryForList(sql));
        List<Map<String, Object>> sqlList = jdbcTemplate.queryForList(sql);
        System.out.println(sqlList.get(0).get("id"));

        model.addAttribute("sqlList",jdbcTemplate.queryForList(sqlList.toString()));
        return "Situation";
    }
}
