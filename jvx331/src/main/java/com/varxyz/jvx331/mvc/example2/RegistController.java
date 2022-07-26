package com.varxyz.jvx331.mvc.example2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistController {
	
	@GetMapping("/example2/step1")// 앞서 get방식으로 들어왔을 때 메소드 부른것과 같은 코드
	public String handleStep1() {
		return "example2/step1"; //약관 페이지
	}
	
	@PostMapping("/example2/step2")
	public String handleStep2() {
		return "example2/step2"; //회원가입
	}
	
	@PostMapping("/example2/step3")
	public String handleStep3() {
		return "example2/step3"; //회원가입 성공페이지
	}
}
