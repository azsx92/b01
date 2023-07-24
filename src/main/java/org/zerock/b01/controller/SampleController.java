package org.zerock.b01.controller;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

@Controller
@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public void hello(Model model) {
        log.info("hello...........");

        model.addAttribute("msg", "HELLo WORLD");
    }

    @GetMapping("/ex/ex1")
    public void ex1(Model model) {
        log.info("hello...........");
        List<String> list = Arrays.asList("AAA","BBB","CCC","DDD");

        model.addAttribute("list",list);
    }


}
