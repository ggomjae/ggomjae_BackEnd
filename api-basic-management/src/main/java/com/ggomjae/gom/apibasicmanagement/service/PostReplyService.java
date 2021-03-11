package com.ggomjae.gom.apibasicmanagement.service;

import com.ggomjae.gom.apibasicmanagement.repository.ReplyRepository;
import com.ggomjae.gom.modulebasicdb.reply.Reply;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostReplyService {

    private final ReplyRepository replyRepository;

    public void saveReply(){
        replyRepository.save(Reply.builder()
            .postId(1L)
            .build());
    }
}
