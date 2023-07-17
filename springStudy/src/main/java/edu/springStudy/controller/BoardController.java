package edu.springStudy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// Component로 하면은 상위 객체인데도 컨트롤러를 못 잡네 
// 베이스 맵핑 경로를 지정해주면은 시간상절약 시킬수 잇어서 좋기는 하다 
@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	//겹쳐도 되기는 하네 
	
	@RequestMapping(value="/list.do")
	public String list(Model model)
	{
		List<String> list = new ArrayList<String>();
		
		list.add("하나번쨰 게시물");
		list.add("둘번쨰 게시물");
		list.add("삼번쨰 게시물");
		list.add("넷번쨰 게시물");
		list.add("다섯번쨰 게시물");
		list.add("여섯번쨰 게시물");
		list.add("일곱번쨰 게시물");
		list.add("팔번쨰 게시물");
		list.add("아홉번쨰 게시물");
		list.add("열번쨰 게시물");
		
		model.addAttribute("list", list);
		return "board/list";
	}
	
	@RequestMapping(value="/view.do")
	public String view()
	{
		return "board/view";
	}
		
	
}
