/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmr.helloworld;

import com.dmr.helloworld.ejb.UsersFacade;
import com.dmr.helloworld.entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.dmr.helloworld.jpaentity.Users;

/**
 *
 * @author fgaurat
 */
@WebServlet(name = "AuthServlet", urlPatterns = {"/auth"})
public class AuthServlet extends HttpServlet {

   
    @EJB
    UsersFacade facade;
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        HttpSession session = request.getSession();
        
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        
        
        try{
            Users u = facade.findByLoginPassword(login, password);
            //User u = new User(login, password); OLD !
            session.setAttribute("user", u);
            request.getRequestDispatcher("/main.jsp").forward(request, response);

        }
        catch(Exception e){
            System.out.println(e);
            
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
        
        
        
        
        //redirection 302
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
