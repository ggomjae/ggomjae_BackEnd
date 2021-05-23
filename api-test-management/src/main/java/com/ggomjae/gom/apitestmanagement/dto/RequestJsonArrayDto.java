package com.ggomjae.gom.apitestmanagement.dto;

import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class RequestJsonArrayDto {

	private String upjong;
	private List<String> keywords;

	@Builder
	public RequestJsonArrayDto(String upjong, List<String> keywords) {
		this.upjong = upjong;
		this.keywords = keywords;
	}
}
