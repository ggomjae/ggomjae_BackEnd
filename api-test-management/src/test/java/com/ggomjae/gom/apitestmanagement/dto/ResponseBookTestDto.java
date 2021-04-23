package com.ggomjae.gom.apitestmanagement.dto;

import com.ggomjae.gom.apitestmanagement.domain.BookTest;
import com.ggomjae.gom.apitestmanagement.entity.Book;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class ResponseBookTestDto {
	public static ResponseBookDto getBookResponseFixture() {
		return ResponseBookDto.from((BookTest.getBookFixture()));
	}

	@Test
	void getBookResponse_ValidBook_ValidPostResponse() {
		Book book = BookTest.getBookFixture();
		ResponseBookDto responseBookDto = ResponseBookDto.from(book);

		then(responseBookDto)
						.hasFieldOrPropertyWithValue("id", book.getId())
						.hasFieldOrPropertyWithValue("content", book.getContent());
	}
}
