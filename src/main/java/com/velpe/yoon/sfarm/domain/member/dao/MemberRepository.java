package com.velpe.yoon.sfarm.domain.member.dao;

import com.velpe.yoon.sfarm.domain.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long>{
}
