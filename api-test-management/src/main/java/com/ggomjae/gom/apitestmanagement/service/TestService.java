package com.ggomjae.gom.apitestmanagement.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TestService {

    public String testMethod(String str){
        return str;
    }

    /*
     *   public은 외부로 노출이 되어있기 때문에
     *   Test Code는 필수적이다. 하지만 privte는 아니다.
     */
    private String notTestMethod(String str){
        return str;
    }
}
