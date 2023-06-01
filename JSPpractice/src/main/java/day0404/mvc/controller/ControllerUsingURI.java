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

@WebServlet(value="*.do")
public class ControllerUsingURI extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Map<String, CommandHandler> commandHandlerMap = new HashMap<>();

	@Override
	public void init() throws ServletException {
		// String coonfigFile = getInitparameter("configFile");
		Properties prop = new Properties();
		String configFilePath = getServletContext().getRealPath("/WEB-INF/commandHandlerURI.properties");
		
		try (FileReader fis = new FileReader(configFilePath)) {
			prop.load(fis);
		} catch (IOException e) {
			throw new ServletException(e);
		}
		
		Iterator keyIter = prop.keySet().iterator();

		while (keyIter.hasNext()) {
			String command = (String)keyIter.next();
			String handlerClassName = prop.getProperty(command);

			try {
				Class<?> handlerClass;
				handlerClass = Class.forName(handlerClassName);
				CommandHandler handlerInstance = (CommandHandler)handlerClass.newInstance();
				commandHandlerMap.put(command, handlerInstance);

			} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
				throw new ServletException(e);

			}

		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process (req, resp);
	}
	
	private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String command = req.getRequestURI();

		if (command.indexOf(req.getContextPath()) == 0) {
			command = command.substring(req.getContextPath().length());
		}

		CommandHandler handler = commandHandlerMap.get(command);

		if (handler == null) {
			handler = new NullHandler();
		}

		String viewPage = null;

		try {
			viewPage = handler.process(req, resp);
		} catch (Throwable e) {
			throw new ServletException(e);
		}

		if (viewPage != null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher(viewPage);
			dispatcher.forward(req, resp);
		}

	}

}
