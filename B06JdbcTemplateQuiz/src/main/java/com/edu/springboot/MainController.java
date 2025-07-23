package com.edu.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.springboot.jdbc.IMemberService;
import com.edu.springboot.jdbc.MemberDTO;

@Controller
public class MainController {

	/* Service역할을 인터페이스의 빈을 자동주입 받는다. 이를 통해
	DAO의 메서드를 호출할 수 있다. (계정 가입, 조회, 삭제 등등) */
	@Autowired
	IMemberService dao;
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	   //회원목록
	   @GetMapping("/list.do")
	   public String member2(MemberDTO dto, Model model) {
	      System.out.println(dto);
	      
	      List<MemberDTO> list;
	      
	       if (dto.getSearchField() != null && dto.getSearchKeyword() != null) {
	           list = dao.search(dto); // 검색
	       } else {
	           list = dao.select(); // 전체
	       }
	      
	      model.addAttribute("memberList", list);
	      return "list";
	   }
	
	/*
	@RequestMapping 어노테이션을 통해 매핑할때 아래와 같이 value, method속성을
	추가해서 요청명과 전송방식을 설정할 수 있다. 하지만 Spring boot 3.x 에서는
	매핑시 @GetMapping, @PostMapping의 사용을 권고하고 있다. */
	
	// 회원등록 페이지 매핑
//	@RequestMapping(value="/regist.do", method=RequestMethod.GET)
	@GetMapping("/regist.do")
	public String member1() {
		return "regist";
	}
	//회원 등록 처리
//	@RequestMapping(value="/regist.do", method=RequestMethod.POST)
	@PostMapping("/regist.do")
	public String member6(MemberDTO memberDTO) {
		//입력한 폼값을 한번에 받은 후 DAO를 호출
		int result = dao.insert(memberDTO);
		//반환값을 통해 성공/실패 판단 가능
		if(result==1) System.out.println("입력되었습니다.");
		/*
		컨트롤러에서 String을 반환하면 View의 경로로 포워드 되지만,
		redirect: 를 사용하면 설정한 요청명으로 이동한다.*/
		return "redirect:list.do";
	}
	
	//회원 수정
	@RequestMapping(value="/edit.do", method=RequestMethod.GET)
	public String member3(MemberDTO memberDTO, Model model) {
		//파라미터로 전달된 아이디는 커맨드객체인 DTO를 통해 받는다.
		memberDTO = dao.selectOne(memberDTO);
		//영역에 DTO 저장
		model.addAttribute("dto", memberDTO);
		//View 로 포워드
		return "edit";
	}
	
	//수정처리
	@RequestMapping(value="/edit.do", method=RequestMethod.POST)
	public String member7(MemberDTO memberDTO) {
		//폼값 DTO에 한꺼번에
		int result = dao.update(memberDTO);
		if(result==1) System.out.println("수정되었습니다.");
		return "redirect:list.do";
	}
	
	//삭제처리1
	@GetMapping("/delete.do")
	public String member4(MemberDTO memberDTO) {
		//폼값 DTO에 한꺼번에
		int result = dao.delete(memberDTO);
		if(result==1) {
			System.out.println("삭제되었습니다.");
		}
		return "redirect:list.do";
	}
	
	//삭제처리2
	@PostMapping("/delete.do")
	public String member9(MemberDTO memberDTO) {
		//폼값 DTO에 한꺼번에
		int result = dao.delete(memberDTO);
		if(result==1) {
			System.out.println("삭제되었습니다.");
		}
		return "redirect:list.do";
	}
}
