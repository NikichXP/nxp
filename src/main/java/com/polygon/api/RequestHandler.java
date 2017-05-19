package com.polygon.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@RestController
public class RequestHandler {

	@RequestMapping("/**")
	public void listen(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("Site req:   " + req.getRequestURL());
	}

}
