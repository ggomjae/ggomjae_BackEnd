package com.ggomjae.gom.apitestmanagement.repository;

import com.ggomjae.gom.apitestmanagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestBookRepository extends JpaRepository<Book, Long> {
}
