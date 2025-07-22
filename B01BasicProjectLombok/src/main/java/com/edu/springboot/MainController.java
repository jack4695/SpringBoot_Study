package com.edu.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	@GetMapping("/dto.do")
	public String dto(MemberDTO memberDTO, Model model) {

		// DTO 인스턴스에 setter를 이용해서 데이터 저장
		memberDTO.setId("kosmo");
		memberDTO.setName("코스모155기");
		memberDTO.setPass("#3335");
		memberDTO.setRegidate("2025-08-27");
		
		// MOdel 인스턴스를 이용해서 request영역에 속성 저장
		model.addAttribute("dto", memberDTO);
		
		// dto.jsp 파일로 포워드 (이 부분은 뷰 리졸버가 경로를 조립해줌)
		return "dto";
	}
}
