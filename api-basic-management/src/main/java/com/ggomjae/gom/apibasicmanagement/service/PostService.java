package com.ggomjae.gom.apibasicmanagement.service;

import com.ggomjae.gom.apibasicmanagement.JPARepository.PostRepository;
import com.ggomjae.gom.modulebasicdb.post.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    public Post savePost(Post post){
        return postRepository.save(post);
    }
}
