package br.com.portalacademico.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Should treat the information and send to the business layer
@SuppressWarnings("serial")
public class UserRegisterController extends HttpServlet{
	private String name = "";
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {
		
		name = request.getParameter("name");
		System.out.println(name);
	}
}
