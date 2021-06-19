package com.example.neobns.service.vo;

import lombok.Data;

@Data
public class CodeVo {
    private String codeGroupId;
    private String code;
    private String codeName;
    private String codeDesc;
    private String sortOrder;
    private String useYn;
    private String codeEngname;
    private String lastUpdateDtime;
    private String lastUpdateUserId;
}
