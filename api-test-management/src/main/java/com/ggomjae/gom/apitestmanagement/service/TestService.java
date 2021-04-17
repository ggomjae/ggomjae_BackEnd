package com.ggomjae.gom.apitestmanagement.service;

import com.ggomjae.gom.apitestmanagement.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TestService {

    private final TestRepository testRepository;

}
