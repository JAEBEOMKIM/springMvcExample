package com.example.neobns.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class MainContoller {

    @RequestMapping(value= "/main.do")
    public String main() {
        log.info("============== main.do call ============");
        return "main:main";
    }
}
