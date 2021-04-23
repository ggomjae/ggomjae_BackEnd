package com.ggomjae.gom.apitestmanagement.service;

import com.ggomjae.gom.apitestmanagement.dto.ResponseBookDto;
import com.ggomjae.gom.apitestmanagement.entity.Book;
import com.ggomjae.gom.apitestmanagement.repository.TestBookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TestService {

    private final TestBookRepository testBookRepository;

    public ResponseBookDto retrieveBook(Long bookId) {
        Book book = testBookRepository.findById(bookId).orElseThrow( () -> new RuntimeException("NOT FOUND BOOK"));
        log.info("BookId : {}", book.getId());
        return ResponseBookDto.from(book);
    }
}
