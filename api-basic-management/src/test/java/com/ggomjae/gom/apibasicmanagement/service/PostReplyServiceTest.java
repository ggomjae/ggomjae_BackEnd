package com.ggomjae.gom.apibasicmanagement.service;

import com.ggomjae.gom.apibasicmanagement.repository.ReplyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
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

    /*
    @Spy
    private PostReplyService postReplyService =
            new PostReplyService(replyRepository);

     */

    @InjectMocks
    PostReplyService postReplyService;

    @Mock
    ReplyRepository replyRepository;


    @Test
    public void void_test(){

        Long number = postReplyService.testMethod();
 //       assertEquals(1L,number); //sucess
        assertEquals(2L,number); // fail
    }

    /*
        @InjectMocks
        Controller controller

        @Spy
        ServiceA servicea

        @Mock
        ServiceB serviceb

        이렇게하면 cotnroller에 servicea, serviceb  (실제,mock)
        이 주입되서 테스트 할 수 있다.
        다만, 대조군과 같은 과학실험같은 느낌이로 이러한 것은 지향하지 않는다.
        웬만하면 mock를 쓰자.
     */
}