package com.example.neobns.service.vo;

import com.example.neobns.entity.Code;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class CodeGroupVo {
    private String codeGroupId;
    private String codeGroupName;
    private String codeGroupDesc;
    private String lastUpdateDtime;
    private String lastUpdateUserId;
    private List<CodeVo> codeList;
}
