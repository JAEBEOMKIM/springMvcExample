package com.example.neobns.service;

import com.example.neobns.entity.CodeGroup;
import com.example.neobns.repository.CodeGroupRepository;
import com.example.neobns.service.vo.CodeGroupVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CodeGroupService {

    private final CodeGroupRepository codeGroupRepository;
    private final ModelMapper modelMapper;

    // 전체조회
    public Iterable findByAll() {
//        return codeGroupRepository.findAll();
        return codeGroupRepository.findAllBy();
    }

    // key 값으로 조회
    public CodeGroupVo findById(String id) {

//        ModelMapper modelMapper = new ModelMapper();
        CodeGroup codeGroup = codeGroupRepository.findById(id).orElseThrow(() -> new RuntimeException("No data"));
        CodeGroupVo vo = modelMapper.map(codeGroup, CodeGroupVo.class);
        return vo;
    }


    // 등록
    public CodeGroup insertCodeGroup(CodeGroup codeGroup) {
        return codeGroupRepository.save(codeGroup);
    }


    // 수정
    public CodeGroup updateCodeGroup(CodeGroup codeGroup, String id) {
        return codeGroupRepository.save(codeGroup);
    }

    // 삭제
    public void deleteById(String id) {
        codeGroupRepository.deleteById(id);
    }
}
