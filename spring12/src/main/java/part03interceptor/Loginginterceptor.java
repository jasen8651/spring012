package part03interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Loginginterceptor extends HandlerInterceptorAdapter{

		public Loginginterceptor() {
			// TODO Auto-generated constructor stub
		}
		
		
		
		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
			System.out.println("log pre handle");
			String uri = request.getRequestURI();
			System.out.println("uri"+uri);
			uri = uri.substring(uri.lastIndexOf("/")+1);
			
			HttpSession session = request.getSession();
			if(session.getAttribute("chk")==null) {
				//로그인상태가 아니면
				response.sendRedirect("login.do?returnUrl="+uri);
				return false;
			}
			return true;
			}
		
		@Override
		public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
				ModelAndView modelAndView) throws Exception {
			// TODO Auto-generated method stub
			super.postHandle(request, response, handler, modelAndView);
		}
	
	
		@Override
		public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
		}
}
