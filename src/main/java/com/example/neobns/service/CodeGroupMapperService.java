package com.example.neobns.service;

import com.example.neobns.entity.CodeGroup;
import com.example.neobns.mapper.CodeGroupMapper;
import com.example.neobns.service.vo.CodeGroupVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CodeGroupMapperService {

    private final CodeGroupMapper codeGroupMapper;

    public Iterable findByAll() {
        return codeGroupMapper.getCodeGroup();
    }

    // key 값으로 조회
    public CodeGroupVo findById(String id) {
        CodeGroup codeGroup = codeGroupMapper.findById(id);
        return null;
    }
}
