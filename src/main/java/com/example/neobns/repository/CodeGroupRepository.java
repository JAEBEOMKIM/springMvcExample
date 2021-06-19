package com.example.neobns.repository;

import com.example.neobns.entity.CodeGroup;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Column;
import java.util.List;

public interface CodeGroupRepository extends CrudRepository<CodeGroup, String> {

//    public Iterable<CodeGroupMap> findByAll(CodeGroupMap codeGroupMap);

    public List<CodeGroupMap> findAllBy();
}

