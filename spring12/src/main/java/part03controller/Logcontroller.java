package part03controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import part03DTO.PersinDTO;

@Controller
public class Logcontroller {
	public Logcontroller() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/login.do")
	public String loginprocess() {
		return "part03/login";
	}

	@RequestMapping("/logpro.do")
	public String loginExecution(PersinDTO dto, HttpSession session) {
		if (dto.getId().equals("kim") && dto.getPass().equals("1234")) {
			session.setAttribute("chk", dto.getId());
			session.setMaxInactiveInterval(1000 * 60 * 30);
			System.out.println(session.getAttribute("chk"));
		}
		return "redirect:/index.do";
	}
	@RequestMapping("/logout.do")
	public String logoutProcess(HttpSession session) {
		session.removeAttribute("chk");
		return "redirect:index.do";
	}
}
