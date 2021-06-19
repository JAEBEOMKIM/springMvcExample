package com.example.neobns.mapper;

import com.example.neobns.service.vo.CodeVo;

import java.util.List;

public interface CodeMapper {

    public List<CodeVo> getCodeList(String codeGroupdId);
}
