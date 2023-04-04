package day0404.mvc.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import day0404.mvc.command.CommandHandler;
import day0404.mvc.command.NullHandler;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value="/ControllerUsingFile")
public class ControllerUsingFile extends HttpServlet { // 실행될 class

	private static final long serialVersionUID = 1L;
	
	private Map<String, CommandHandler> commandHandlerMap = new HashMap<>();
	// HashMap 객체 생성, <커맨드, 핸들러인스턴스> 매핑 정보 저장
	//	=> 커맨드핸들러를 상속받아 다루는 객체 전부를 저장할 수 있게 된다.
	
	@Override
	public void init() throws ServletException {
		
		Properties prop = new Properties(); // properties 파일을 읽어 저장해 올 수 있는 객체 선언
		String configFilePath = getServletContext().getRealPath("/WEB-INF/commandHandler.properties");
		/*
		 * getServletContext(): 프로젝트가 어디 있는지 반환 / 어플리케이션까지의 경로
		 * getRealPath("경로"): 경로 반환 / 어플리케이션 다음의 경로
		 * 두 개의 경로를 합쳐 어플리케이션 파일의 경로를 저장한다(어플리케이션 경로 + 안의 경로).
		 */

		try (FileReader fis = new FileReader(configFilePath)) { // 2byte씩 읽어 오는 Stream 연결
			prop.load(fis); // Stream을 통해 읽어 온 내용을 prop에 저장

		} catch (IOException e) {
			throw new ServletException (e);

		}

		Iterator keyIter = prop.keySet().iterator(); // key값을 iterator 객체로 저장
		
		while (keyIter.hasNext()) { // 읽어 올 key값이 있다면 수행할 문장
			String command = (String) keyIter.next();
			String handlerClassName = prop.getProperty(command);
			
			try { // Class를 객체로 만든다.
				Class<?> handlerClass = Class.forName(handlerClassName); // class 명에 맞는 class 찾기
				CommandHandler handlerInstance = (CommandHandler) handlerClass.newInstance(); // 객체 생성
				commandHandlerMap.put(command, handlerInstance); // 요청 - 생성한 객체를 매핑해 저장

			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				throw new ServletException(e);

			}

		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String command = request.getParameter("cmd");
		CommandHandler handler = commandHandlerMap.get(command);

		if (handler == null) {
			handler = new NullHandler();
		}

		String viewPage = null;

		try {
			viewPage = handler.process(request, response);

		} catch (Throwable e) {
			throw new ServletException(e);

		}

		if (viewPage != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
			// forward 없음, 요청 처리 끝.

		}

	}
	
}
