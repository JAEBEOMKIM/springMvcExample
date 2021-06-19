package com.example.neobns.controller;

import com.example.neobns.entity.CodeGroup;
import com.example.neobns.service.CodeGroupService;
import com.example.neobns.service.vo.CodeGroupVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MainContoller {

    private final CodeGroupService codeGroupService;

    @RequestMapping(value= "/main.do")
    public String main(ModelMap model) {
        log.info("============== main.do call ============");

        Iterable<CodeGroup> codeGroups = codeGroupService.findByAll();
        model.addAttribute("codeGroup", codeGroups);
        return "main:main";
    }

    @RequestMapping(value= "/jpa/codelist.do")
    public String codelist_jpa(ModelMap model, @RequestParam Map<String, String> param) {
        log.info("============== main.do call ============");

        String id = param.get("id");
        CodeGroupVo codelist = codeGroupService.findById(id);
        model.addAttribute("codelist", codelist);
        return "main:codelist";
    }


    // 코드목록 전체
    @GetMapping(value = "/codeGroup")
    public ResponseEntity codeGroup() {
        Iterable<CodeGroup> codeGroups = codeGroupService.findByAll();
        return ResponseEntity.ok().body(codeGroups);
    }

    // 코드그룹에 속한 코드목록 조회
    // http://localhost:8080/codeGroup/CM00040
    @GetMapping(value = "/codeGroup/{id}") // CM00040
    public ResponseEntity codeGroupKey(@PathVariable("id") String id) {
        CodeGroupVo codeGroups = codeGroupService.findById(id);
        return ResponseEntity.ok().body(codeGroups);
    }
}
