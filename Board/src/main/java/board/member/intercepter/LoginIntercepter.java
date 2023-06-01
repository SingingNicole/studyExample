package board.member.intercepter;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.servlet.HandlerInterceptor;

import board.member.dto.MemDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginIntercepter implements HandlerInterceptor {
	// 인터셉터를 적용할 리스트
	public List<String> loginEssential 
	= Arrays.asList("/board/**");

	// 인터셉터를 적용하지 않을 리스트
	public List<String> loginInessential 
	= Arrays.asList("/board/list/**", "/board/content/**");

	// preHandle: 컨트롤러에 도착하기 전에 동작하는 메소드로 return값이 true이면 진행, false이면 멈춤.
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		MemDto dto = (MemDto) request.getSession().getAttribute("user");
		
		if (dto != null && dto.getId() != null) {
			return true;
		} else {
			response.sendRedirect("/main");
			return false;
		}
	}


}
