package com.example.neobns.entity;

import lombok.Data;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "fwk_code")
public class Code {
    @Id
    @Column(name="CODE_GROUP_ID")
    private String codeGroupId;

    @Column(name="CODE")
    private String code;

    @Column(name="CODE_NAME")
    private String codeName;

    @Column(name="CODE_DESC")
    private String codeDesc;

    @Column(name="SORT_ORDER")
    private String sortOrder;

    @Column(name="USE_YN")
    private String useYn;

    @Column(name="CODE_ENGNAME")
    private String codeEngname;

    @Column(name="LAST_UPDATE_DTIME")
    private String lastUpdateDtime;

    @Column(name="LAST_UPDATE_USER_ID")
    private String lastUpdateUserId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_GROUP_ID", insertable = false, updatable = false)
    private CodeGroup codeGroup;
}


