package com.RezaAk.meritamerica.ButtonClicker.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ButtonClicker
 */
@WebServlet("/ButtonClicker")
public class ButtonClicker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ButtonClicker() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
    
    
    //doGet
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		//create new String (counter)
		String count = (String) session.getAttribute("count");
		Integer number;
		
		
		if(count == null) {
			session.setAttribute("count", "0");
			
		}
		else {
			number = Integer.parseInt(count);
			number += 1;
			count = number.toString();
			session.setAttribute("count", count);
			
		}
		
		
		
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Views/Clicker.jsp");
        view.forward(request, response);
		
		
		
	}

	
	
	
	
	
	//doPost
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
