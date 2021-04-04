package com.ggomjae.gom.apibasicmanagement.JPARepository;


import com.ggomjae.gom.modulequerydsldb.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
