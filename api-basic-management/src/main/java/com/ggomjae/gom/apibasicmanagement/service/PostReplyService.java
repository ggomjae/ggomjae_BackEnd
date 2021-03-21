package com.ggomjae.gom.apibasicmanagement.service;

import com.ggomjae.gom.apibasicmanagement.JPARepository.ReplyRepository;
import com.ggomjae.gom.modulebasicdb.reply.Reply;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class PostReplyService {

    private final ReplyRepository replyRepository;

    public void saveReply(){
        replyRepository.save(Reply.builder()
            .postId(1L)
            .build());
    }

    public Long testMethod(){
      log.info("test check !");
      return 1L;
    }
}
