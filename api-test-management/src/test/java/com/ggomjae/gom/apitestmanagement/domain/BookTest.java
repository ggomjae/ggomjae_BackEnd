package com.ggomjae.gom.apitestmanagement.domain;

import com.ggomjae.gom.apitestmanagement.entity.Book;
import org.springframework.test.util.ReflectionTestUtils;

public class BookTest {
	public static Book getBookFixture() {
		return getBookFixture(1L);
	}

	public static Book getBookFixture(Long id) {
		Book book = Book.builder()
						.content("content")
						.build();
		ReflectionTestUtils.setField(book, "id", id);
		return book;
	}
}
