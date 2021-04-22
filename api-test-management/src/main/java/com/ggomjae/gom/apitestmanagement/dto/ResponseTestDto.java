package com.ggomjae.gom.apitestmanagement.dto;

import com.ggomjae.gom.apitestmanagement.entity.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResponseTestDto {

	private Long id;
	private String content;

	private ResponseTestDto(Book book) {
		this.id = book.getId();
		this.content = book.getContent();
	}

	public static ResponseTestDto from(Book book) {
		return new ResponseTestDto(book);
	}
}
