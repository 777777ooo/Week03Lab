/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dont1
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstNum = request.getParameter("first");
        String secondNum = request.getParameter("second");
        
        if (firstNum.equals("") || secondNum.equals("") || !firstNum.matches("[0-9]+") || !secondNum.matches("[0-9]+")){
            request.setAttribute("result", "Invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            return;
        
        }
        
        int first = Integer.parseInt(firstNum);
        int second = Integer.parseInt(secondNum);
        int result = 0;
        
        String operator = request.getParameter("submit");
        
        switch (operator) {
            case "+":
                result = first + second;
               
                break;
                
                
            case "-":
                result = first - second;
                
                break;
        
            case "*":
                result = first * second;
                
                break;
                
            case "%":
                result = first / second;
                
                break;
        
        
        }
        
        request.setAttribute("result", result);
               getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
        
    }
}
    
    

  


   