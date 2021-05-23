package com.ggomjae.gom.apitestmanagement.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResultDto {

	private String keyword;
	private String upjong;

	@Builder
	public ResultDto(String keyword, String upjong) {
		this.keyword = keyword;
		this.upjong = upjong;
	}
}
