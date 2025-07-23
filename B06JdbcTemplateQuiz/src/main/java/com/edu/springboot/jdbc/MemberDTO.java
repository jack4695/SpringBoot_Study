package com.edu.springboot.jdbc;

import lombok.Data;

@Data
public class MemberDTO {
	private String id;
	private String pass;
	private String name;
	private String regidate;
	
	// 선택된 검색 조건
	private String searchField;
	
	// 입력한 검색어
	private String searchKeyword;
}
