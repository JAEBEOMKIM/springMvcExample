package com.example.neobns.mapper;

import com.example.neobns.entity.CodeGroup;
import com.example.neobns.service.vo.CodeGroupVo;

import java.util.List;

public interface CodeGroupMapper {

    public List<CodeGroupVo> getCodeGroup();

    public CodeGroup findById(String id);

}
