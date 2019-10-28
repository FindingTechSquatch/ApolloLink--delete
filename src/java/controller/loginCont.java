/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import encrypt.ec;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import obj.uBase;
import validation.IVString;

/**
 *
 * @author tyleryork
 */
public class loginCont extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/updNfo.jsp";

        HttpSession session = request.getSession();

        String action = request.getParameter("act");
        if (action == null) {
            action = "n";
        }

        if (action.equalsIgnoreCase("n")) { //brand new, just accessing the site
            session.setAttribute("hd", "hidden");
            ArrayList<String> lgError = new ArrayList();
            session.setAttribute("er", lgError);
            
        } else if (action.equalsIgnoreCase("s")) { //sign up

        } else if (action.equalsIgnoreCase("lg")) { //regular log in
            uBase cus = new uBase();
            ArrayList<String> lgError = new ArrayList();

            String us = request.getParameter("us");
            String pw = request.getParameter("pw");
            boolean lg1, lg2, lg3 = false;
            lg1 = IVString.ContainsText(us);
            lg2 = IVString.MatchesRegex(us, IVString.regexLib("email"));
            lg3 = IVString.ContainsText(pw);

            if (lg1 && lg2 && lg3) {
                url = "/testSuccess.jsp";
                
                cus.setUus(us);
                cus.setHus(ec.EC_dus(us));
                cus.setHpw(ec.EC_dpw(us));
                session.setAttribute("us", cus.getUus());
                session.setAttribute("pw", cus.getHpw());
            } else {
                url = "/index.jsp";
                if (!lg1 || !lg2) {
                    session.setAttribute("hd","");
                    if (!lg1) {
                        lgError.add("An email was not entered.");
                    } else if (!lg2) {
                        lgError.add("An invalid email was entered.");
                    }
                }
                if (!lg3) {
                    lgError.add("A password was not entered.");
                }
                session.setAttribute("er", lgError);

            }

        } else if (action.equalsIgnoreCase("e")) { //clicks event manager button

        } else if (action.equalsIgnoreCase("f")) { //event manager login

        } else {

        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        processRequest(request, response);
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
