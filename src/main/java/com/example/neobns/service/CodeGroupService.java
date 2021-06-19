package com.example.neobns.service;

import com.example.neobns.entity.CodeGroup;
import com.example.neobns.repository.CodeGroupMap;
import com.example.neobns.repository.CodeGroupRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CodeGroupService {

    private final CodeGroupRepository codeGroupRepository;

    // 전체조회
    public Iterable findByAll() {
//        return codeGroupRepository.findAll();
        return codeGroupRepository.findAllBy();
    }

    // key 값으로 조회
    public Object findById(String id) {
        return codeGroupRepository.findById(id);
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
