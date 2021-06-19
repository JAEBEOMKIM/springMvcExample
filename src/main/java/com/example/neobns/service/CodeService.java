package com.example.neobns.service;

import com.example.neobns.entity.Code;
import com.example.neobns.entity.CodeGroup;
import com.example.neobns.repository.CodeGroupRepository;
import com.example.neobns.repository.CodeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CodeService {

    private final CodeRepository codeRepository;

    // 전체조회
    public Iterable<Code> findByAll() {
        return codeRepository.findAll();
    }

    // key 값으로 조회
    public Object findById(String id) {
        return codeRepository.findById(id);
    }


    // 등록
    public Code insertCode(Code code) {
        return codeRepository.save(code);
    }


    // 수정
    public Code updateCode(Code code, String id) {
        return codeRepository.save(code);
    }

    // 삭제
    public void deleteById(String id) {
        codeRepository.deleteById(id);
    }
}
