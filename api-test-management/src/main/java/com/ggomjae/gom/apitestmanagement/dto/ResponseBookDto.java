package com.ggomjae.gom.apitestmanagement.dto;

import com.ggomjae.gom.apitestmanagement.entity.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResponseBookDto {

	private Long id;
	private String content;

	private ResponseBookDto(Book book) {
		this.id = book.getId();
		this.content = book.getContent();
	}

	public static ResponseBookDto from(Book book) {
		return new ResponseBookDto(book);
	}
}
