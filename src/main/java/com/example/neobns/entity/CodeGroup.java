package com.example.neobns.entity;

import lombok.Data;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "fwk_code_group")
public class CodeGroup {
    @Id
    @Column(name="CODE_GROUP_ID")
    private String codeGroupId;

    @Column(name="CODE_GROUP_NAME")
    private String codeGroupName;

    @Column(name="CODE_GROUP_DESC")
    private String codeGroupDesc;

    @Column(name="LAST_UPDATE_DTIME")
    private String lastUpdateDtime;

    @Column(name="LAST_UPDATE_USER_ID")
    private String lastUpdateUserId;

}

