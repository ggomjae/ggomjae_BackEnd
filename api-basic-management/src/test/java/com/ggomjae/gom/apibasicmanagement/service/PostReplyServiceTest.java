package com.ggomjae.gom.apibasicmanagement.service;

import com.ggomjae.gom.apibasicmanagement.repository.ReplyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class PostReplyServiceTest {

    @Mock
    ReplyRepository replyRepository;

    @Spy
    private PostReplyService postReplyService =
            new PostReplyService(replyRepository);

    @Test
    public void void_test(){

        Long number = postReplyService.testMethod();
//        assertEquals(1L,number); - sucess
        assertEquals(2L,number); // fail
    }
}