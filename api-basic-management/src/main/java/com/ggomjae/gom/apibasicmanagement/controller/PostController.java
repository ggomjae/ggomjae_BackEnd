package com.ggomjae.gom.apibasicmanagement.controller;

import com.ggomjae.gom.apibasicmanagement.dto.RequestSavePostDto;
import com.ggomjae.gom.apibasicmanagement.service.PostService;
import com.ggomjae.gom.modulebasicdb.post.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;

//    @PostMapping("/post")
//    public Post savePost(@RequestBody RequestSavePostDto requestDto){
//        return postService.savePost(requestDto.toPost());
//    }

    // 만약 찾고 지운다면 , postService.find(1L) 로 찾고 갖고온다음에 deletePost(Post) 를 넘겨줌.
}
