package edu.springStudy.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//콘텍스트 path에서 그 뒤에 나올 경로를 따로 설정해준다 
	//핸들러 맵핑 넘어노는 메소드의 경로가 같은걸 찾는다 
	//handlerMapping는  호출된 메소드를
	// 디스베쳐가 가져가서  리턴된 결과를 갖는다 ??
	// 애를 뷰 리졸버한테 준다 
	// 가상경로와 일치하는 메소드를 찾는다 ??
	// 매칭 된후 호출 하기 하는데 이때가 핸들어 어댑터 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", "반갑다 친구아" );  //request.setAttridute() 같다 
		
		return "home";
	}

	//반드시 public String 
	// 경로를 받아서 무조건 문자열이 들어가니까 String 
	//.do 가상까지 밸류에 써줘야 됨 
	//의외로 많이 실수할듯 
	//최종적으로 뷰를 보여줄 파일의 이름이 리턴으로 들어간다  내가 포워드 하고자하는 즉 보여주고자 하는 view 화면 
	@RequestMapping(value = "/sample.do", method= RequestMethod.GET)
	public String sample( Model model)
	{
		
		String name = "단군왕검";
		int age = 900;
		String addr = "한반도";
		String phone = "010 넌 폰 잇니?";
		
		String aged = Integer.toString(age);
		ArrayList<String> arr = new ArrayList<String>();
		arr.add(name);
		arr.add(phone);
		arr.add(addr);
		arr.add(aged);
		
		
		// 넘어 가야 할 키값은 문자열로 받아야 한다  특정 키 값을 찾아야할떄 써야되는 이름을 지정해서 사용할수 있다 
		model.addAttribute("arr", arr);
		return "ex01";
	}
	//우와 개 에바야 하위 위치까지 리턴에 써줘야 인식을 하네 
	// prefix에 지정된 위치에서 2단으로 들어가는 경로면은 2단으로 해서 써줘야 인식하겟네 ㄷㄷ 뎁쓰라고 하네 depth?
	/*
	 * @RequestMapping(value = "/board/list.do", method =RequestMethod.GET) public
	 * String list() { return "board/list"; }
	 */
	
	@RequestMapping(value="/sample.do", method= RequestMethod.POST)
	public String sample1(String name,
				String age,
				String addr,
				String phone
			)
	{
		
		//400오류는 매개변수를 봐야 한다 
		System.out.println("name ::" + name);
		// 인트 같은 경우 null 값을 못 받으니 이를 방지 하기 위한 예외검사에 형 변환
		if(age != null && !age.equals(""))
		{
			int ageint = Integer.parseInt(age);
			System.out.println("age ::" + ageint);
		}
		//System.out.println("age ::" + ageint);
		System.out.println("addr ::" + addr);
		System.out.println("phone ::" + phone);
		
		return "ex01";
	}
}
