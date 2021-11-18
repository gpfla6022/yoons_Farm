package com.velpe.yoon.sfarm.domain.member.application;

import com.velpe.yoon.sfarm.domain.member.domain.Member;
import com.velpe.yoon.sfarm.domain.member.dto.MemberSaveForm;

import java.util.Optional;

public interface MemberService {

    /**
     * 회원가입 로직
     * @param memberSaveForm
     */
    void save(MemberSaveForm memberSaveForm);


    /**
     * 회원번호로 회원 찾기
     * @param id
     * @return
     */
    Optional<Member> findById(Long id);

    /**
     * 이름으로 회원 찾기
     * @param name
     * @return
     */
    Optional<Member> findByName(Long name);

    /**
     * 아이디로 회원 찾기
     * @param loginId
     * @return
     */
    Optional<Member> findByLoginId(Long loginId);
    
}
