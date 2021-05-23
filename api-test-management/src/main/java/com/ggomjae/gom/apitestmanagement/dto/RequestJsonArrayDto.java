package com.ggomjae.gom.apitestmanagement.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
public class RequestJsonArrayDto {

	private String upjong;
	private List<String> keywords;

	@Builder
	public RequestJsonArrayDto(String upjong, List<String> keywords) {
		this.upjong = upjong;
		this.keywords = keywords;
	}

	// List 반환
	public List<ResultDto> getResultDtoList() {
		return this.keywords.stream().map( keyword -> new ResultDto(keyword, this.upjong))
						.collect(Collectors.toList());
	}
}
