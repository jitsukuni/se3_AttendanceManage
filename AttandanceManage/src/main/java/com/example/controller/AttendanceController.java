package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class AttendanceController {

    @GetMapping("/Attendance")
    public String attendance() {
        Date nowDate = new Date();
        SimpleDateFormat sdfA = new SimpleDateFormat("HH:mm:ss");
        String formatNowDate = sdfA.format(nowDate);
        System.out.println(formatNowDate);
        /*
        String sqlInsert = "UPDATE attendances SET begin_time = '"+formatNowDate+"' WHERE id = "+idTest+";";
        System.out.println(sqlInsert);
        jdbcTemplate.update(sqlInsert);
        */
        return "Attendance";
    }
}
