package com.example.neobns.controller;

import com.example.neobns.entity.CodeGroup;
import com.example.neobns.service.CodeGroupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MainContoller {

    @RequestMapping(value= "/main.do")
    public String main(ModelMap model) {
        log.info("============== main.do call ============");

        Iterable<CodeGroup> codeGroups = codeGroupService.findByAll();
        model.addAttribute("codeGroup", codeGroups);
        return "main:main";
    }

    private final CodeGroupService codeGroupService;

    @RequestMapping(value = "/codeGroup")
    public ResponseEntity codeGroup() {

        Iterable<CodeGroup> codeGroups = codeGroupService.findByAll();
        return ResponseEntity.ok().body(codeGroups);
    }
}
