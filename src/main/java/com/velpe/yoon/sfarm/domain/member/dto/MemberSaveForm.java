package com.velpe.yoon.sfarm.domain.member.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MemberSaveForm {

    private String loginId;

    private String loginPw;

    private String name;

    private String nickName;

    private String email;

    private String authCode;

    private boolean personalAgree;



}
