package part01controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8090/myapp/list.do
//http://localhost:8090/myapp/view.do
//http://localhost:8090/myapp/write.do
@Controller
public class HomeController {
	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/list.do")
	public String listProcess() {
		System.out.println("lostcontroller");
		return "part01/list";
	}
	
	@RequestMapping("/view.do")
	public String viewprocess() {
		System.out.println("view controller");
		return "part01/view";
	}
	
	@RequestMapping("/write.do")
	public String writeprocess() {
		System.out.println("write controller");
		return "part01/write";
	}
	
}
