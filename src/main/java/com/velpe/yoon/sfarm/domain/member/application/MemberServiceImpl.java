package com.velpe.yoon.sfarm.domain.member.application;

import com.velpe.yoon.sfarm.domain.member.domain.Member;
import com.velpe.yoon.sfarm.domain.member.dao.MemberRepository;
import com.velpe.yoon.sfarm.domain.member.dto.MemberSaveForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class
MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public void save(MemberSaveForm memberSaveForm) {
        memberRepository.save(
                Member.builder()
                        .loginId(memberSaveForm.getLoginId())
                        .loginPw(memberSaveForm.getLoginPw())
                        .name(memberSaveForm.getName())
                        .nickName(memberSaveForm.getNickName())
                        .email(memberSaveForm.getEmail())
                        .authCode(memberSaveForm.getAuthCode())
                        .personalAgree(memberSaveForm.isPersonalAgree())
                        .build()
        );
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(Long name) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByLoginId(Long loginId) {
        return Optional.empty();
    }
}
