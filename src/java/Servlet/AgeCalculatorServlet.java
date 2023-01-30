/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author darkn
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
        .forward(request, response);
    }

    @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    String userAge = request.getParameter("age");
    request.setAttribute("age",userAge);
    if (userAge == null || userAge.equals("")) {
        request.setAttribute("message", "You must give your current age.");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
        return;
    }
    else{
      try {
          int newAge = Integer.parseInt(userAge);
          request.setAttribute("message", "Your age next birthday will be : " + (newAge + 1));
      } catch(NumberFormatException e) {
            request.setAttribute("message", "You must enter a number.");
      }  
      getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
    }
  }
}
