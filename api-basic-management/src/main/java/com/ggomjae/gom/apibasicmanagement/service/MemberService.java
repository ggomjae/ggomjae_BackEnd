package com.ggomjae.gom.apibasicmanagement.service;

import com.ggomjae.gom.apibasicmanagement.JPARepository.MemberRepository;
import com.ggomjae.gom.apibasicmanagement.dto.ServiceCreateMemberDto;
import com.ggomjae.gom.modulequerydsldb.domain.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public String createMemberAfterGetMemberName(ServiceCreateMemberDto serviceDto){
        Member member = memberRepository.save(serviceDto.toMember());
        return member.getMemberName();
    }

    public String testMethod(){
        return "test";
    }
}
