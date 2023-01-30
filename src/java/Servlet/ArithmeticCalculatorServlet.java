package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author darkn
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        request.getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
        .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstNumber = request.getParameter("firstnumber");
        String secondNumber = request.getParameter("secondnumber");
        
        request.setAttribute("firstnumber", firstNumber);
        request.setAttribute("secondnumber", secondNumber);
        
        try{
            //.trim() added to ignore an accidental space
            int num1 = Integer.parseInt(firstNumber.trim());
            int num2 = Integer.parseInt(secondNumber.trim());
            int result = 0;
            
            String operator = request.getParameter("submit");
            
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("%")) {
                result = num1 / num2;
            }
            request.setAttribute("message", result);
        }
        catch (NumberFormatException e) {
            request.setAttribute("message", "invalid");
        }
        catch (ArithmeticException e) {
            request.setAttribute("message", "Cannot divide by 0");
        }
        finally{
            getServletContext()
                .getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        } 

    }
}
