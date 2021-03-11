package com.ggomjae.gom.modulebasicdb.reply;

import com.ggomjae.gom.modulebasicdb.post.Post;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/*
    구현했으나 원하는 방향으로 작동이 되지 않음.
    무조건 N : 1 관계에서 N에 1을 setting해줘야 가능한 것인가?
    2021 - 03 - 11
 */


//@DynamicUpdate
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicInsert
@Entity
@Table(name = "replies")
@Getter
@Setter
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "post_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    @Column(name = "post_id")
    private Long postId;

    @Builder
    public Reply(Long postId){
        this.postId = postId;
    }
}