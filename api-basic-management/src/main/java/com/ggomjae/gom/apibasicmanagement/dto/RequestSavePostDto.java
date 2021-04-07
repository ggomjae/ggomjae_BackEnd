package com.ggomjae.gom.apibasicmanagement.dto;

import com.ggomjae.gom.modulebasicdb.post.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class RequestSavePostDto {

    private String title;
    private String content;

    @Builder
    public RequestSavePostDto(String title, String content){
        this.title = title;
        this.content = content;
    }

    public Post toPost(){
        return Post.builder()
                .title(this.title)
                .content(this.content)
                .build();
    }
}
