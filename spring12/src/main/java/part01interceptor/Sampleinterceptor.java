package part01interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Sampleinterceptor extends HandlerInterceptorAdapter{
	
	public Sampleinterceptor() {
		// TODO Auto-generated constructor stub
	}
	
	@Override  //요청 컨트롤러에 들어가기전 접급
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preheandle..");
		return true;
	}
	
	@Override  // 요청 컨트롤러 접근 후 뷰 페이지에 접근
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("posthandle");
		
	}
	
	
	@Override  //요청 컨트롤러 접근 후 뷰 페이지 접근후 response 하기전 
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
			System.out.println("aftercompletion");
	}

}
