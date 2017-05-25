package com.etctest.websocket;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etctest.util.WebSocketServer;

/**
 * Handles requests for the application home page.
 */
@Controller
public class WebsocketController {
	
	private static final Logger logger = LoggerFactory.getLogger(WebsocketController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/websocketClient", method = RequestMethod.GET)
	public String wsClient(Locale locale, Model model) {
		//logger.info("websocket test~!");
		
		return "/websocket/websocketClient";
	}
	
	
	@RequestMapping(value = "/websocketServer", method = RequestMethod.GET)
	public String wsServer(Locale locale, Model model) {
		//logger.info("websocket test~!");
		
		WebSocketServer ws = new WebSocketServer();
		ws.sendAllSessionToMessageWebsocketInfo("서버메세지 전달합니다~!!");
		
		
		return "/websocket/websocketServer";
	}
	
}
