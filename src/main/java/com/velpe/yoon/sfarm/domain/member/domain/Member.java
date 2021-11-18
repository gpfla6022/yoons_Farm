package com.velpe.yoon.sfarm.domain.member.domain;

import lombok.Builder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loginId;

    private String loginPw;

    private String name;

    private String nickName;

    private String email;

    private String authCode;

    private int authLevel;

    @Column(name = "personal_agreement")
    private boolean personalAgree;

    private LocalDateTime regDate;

    private LocalDateTime updateDate;

    /**
     *
     * @param loginId
     * @param loginPw
     * @param name
     * @param nickName
     * @param email
     * @param authCode
     * @param personalAgree
     */
    @Builder
    public Member(String loginId, String loginPw, String name, String nickName, String email, String authCode, boolean personalAgree) {

        this.loginId = loginId;
        this.loginPw = loginPw;
        this.name = name;
        this.nickName = nickName;
        this.email = email;
        this.authCode = authCode;
        this.personalAgree = personalAgree;
    }

}
/*
1. ORM // DTO // Repository

2. Service

 */