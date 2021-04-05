package com.ggomjae.gom.apibasicmanagement.service;

import com.ggomjae.gom.apibasicmanagement.JPARepository.MemberRepository;
import com.ggomjae.gom.apibasicmanagement.dto.ServiceCreateMemberDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class MemberServiceTest {

    @InjectMocks
    MemberService memberService;

    @Mock
    MemberRepository memberRepository;

    @Test
    public void member_test(){

        //given
        ServiceCreateMemberDto serviceCreateMemberDto = ServiceCreateMemberDto.builder()
                .memberAge(29)
                .memberName("ggomjae")
                .build();

        memberService.createMemberAfterGetMemberName(serviceCreateMemberDto);

        //when
        String realMemberName = memberService.createMemberAfterGetMemberName(serviceCreateMemberDto);

        //then
        assertEquals(serviceCreateMemberDto.getMemberName(), realMemberName);
    }
}