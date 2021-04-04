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
    public Member createMember(ServiceCreateMemberDto serviceDto){

        return memberRepository.save(serviceDto.toMember());
    }

    public String testMethod(){
        return "test";
    }
}
