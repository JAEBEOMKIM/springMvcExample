package com.example.neobns.service;

import com.example.neobns.entity.CodeGroup;
import com.example.neobns.mapper.CodeGroupMapper;
import com.example.neobns.service.vo.CodeGroupVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CodeGroupMapperService {

    private final CodeGroupMapper codeGroupMapper;
    private final ModelMapper modelMapper;

    public Iterable findByAll() {
        return codeGroupMapper.getCodeGroup();
    }

    // key 값으로 조회
    public CodeGroupVo findById(String id) {
        CodeGroup codeGroup = codeGroupMapper.findById(id);
        CodeGroupVo codeGroupVo = modelMapper.map(codeGroup, CodeGroupVo.class);
        return codeGroupVo;
    }
}
