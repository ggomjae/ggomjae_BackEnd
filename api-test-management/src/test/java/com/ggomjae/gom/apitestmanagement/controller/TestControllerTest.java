package com.ggomjae.gom.apitestmanagement.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ggomjae.gom.apitestmanagement.dto.RequestJsonArrayDto;
import com.ggomjae.gom.apitestmanagement.dto.ResponseBookDto;
import com.ggomjae.gom.apitestmanagement.dto.ResponseBookTestDto;
import com.ggomjae.gom.apitestmanagement.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class TestControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private TestService testService;

	/*
			Controller Test : 결과값이 예상되는 ResponseDto가 필요로 했음
			- ResponseBookTestDto의 getBookResponseFixture() 를 통해 ResponseDto를 불러오기.
			- 어떠한 Long 타입의 값이 오면 그 예상되는 Dto를 반환해야한다고 가정을 해놓자.
			- MockMvc를 통해 get을 구현하고 예상되는 값이 맞는지 확인하자.
	 */

	@Test
	void readBook_ValidInput_ValidOutput() throws Exception {
		ResponseBookDto responseBookDto = ResponseBookTestDto.getBookResponseFixture();
		given(testService.retrieveBook(anyLong())).willReturn(responseBookDto);

		this.mvc.perform(get("/test/book/{book_id}", 1))
						.andExpect(status().isOk())
						.andExpect(jsonPath("id").value(1L))
						.andExpect(jsonPath("content").value("content"));
	}
	
	@Test
	void JSONARRAY_파싱() {
		List<RequestJsonArrayDto> list = create_JSON();


	}

	List<RequestJsonArrayDto> create_JSON() {

		List<String> keywords_1 = Arrays.asList("keyword_1_1","keyword_1_2","keyword_1_3");
		List<String> keywords_2 = Arrays.asList("keyword_2_1","keyword_2_2","keyword_2_3");

		List<RequestJsonArrayDto> keywordsByUpjong = new ArrayList<>();

		keywordsByUpjong.add(RequestJsonArrayDto.builder()
						.upjong("upjong_1")
						.keywords(keywords_1)
						.build());

		keywordsByUpjong.add(RequestJsonArrayDto.builder()
						.upjong("upjong_2")
						.keywords(keywords_2)
						.build());


		return keywordsByUpjong;
	}
}