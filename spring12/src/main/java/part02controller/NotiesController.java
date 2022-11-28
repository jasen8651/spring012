package part02controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotiesController {

	public NotiesController() {
		
	}
	
	@RequestMapping("/noticeList.do")
	public String process() {
		System.out.println("noticeList");
		return "part02/noticeList";
	}
}
