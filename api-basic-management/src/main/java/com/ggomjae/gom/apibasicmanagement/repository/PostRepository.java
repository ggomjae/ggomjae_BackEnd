package com.ggomjae.gom.apibasicmanagement.repository;

import com.ggomjae.gom.modulebasicdb.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long > {
}
