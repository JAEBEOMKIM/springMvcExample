package com.example.neobns.controller;

import com.example.neobns.entity.CodeGroup;
import com.example.neobns.mapper.CodeGroupMapper;
import com.example.neobns.service.CodeGroupMapperService;
import com.example.neobns.service.vo.CodeGroupVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MybatisController {

    private final CodeGroupMapperService codeGroupService;

    @RequestMapping(value= "/mybatis/main.do")
    public String main(ModelMap model) {
        log.info("============== mybatis/main.do call ============");

        Iterable codeGroups = codeGroupService.findByAll();
        model.addAttribute("codeGroup", codeGroups);
        return "main:main";
    }

    @RequestMapping(value= "/mybatis/codelist.do")
    public String codelist_mybatis(ModelMap model, @RequestParam Map<String, String> param) {
        log.info("============== main.do call ============");

        String id = param.get("id");
        CodeGroupVo codelist = codeGroupService.findById(id);
        model.addAttribute("codelist", codelist);
        return "main:codelist";
    }

}
