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
        String url = "/index.jsp";

        HttpSession session = request.getSession();

        String action = request.getParameter("act");
        if (action == null) {
            action = "n";
        }

        if (action.equalsIgnoreCase("n")) { //brand new, just accessing the site
            session.setAttribute("hd1", "hidden");
            session.setAttribute("hd2", "hidden");
            ArrayList<String> lgError1 = new ArrayList();
            ArrayList<String> lgError2 = new ArrayList();
            session.setAttribute("er1", lgError1);
            session.setAttribute("er2", lgError1);

            //needs to load schools
        } else if (action.equalsIgnoreCase("su")) { //sign up
            session.setAttribute("hd1", "hidden");
            session.setAttribute("hd2", "hidden");
            ArrayList<String> lgError1 = new ArrayList();
            ArrayList<String> lgError2 = new ArrayList();
            session.setAttribute("er1", lgError1);
            session.setAttribute("er2", lgError1);
            
            

        } else if (action.equalsIgnoreCase("lg")) { //regular log in
            uBase cus = new uBase();
            session.setAttribute("hd1", "hidden");
            session.setAttribute("hd2", "hidden");
            ArrayList<String> lgError1 = new ArrayList();
            ArrayList<String> lgError2 = new ArrayList();
            session.setAttribute("er1", lgError1);
            session.setAttribute("er2", lgError1);

            String us = request.getParameter("us");
            String pw = request.getParameter("pw");
            boolean lg1, lg2, lg3 = false;
            lg1 = IVString.ContainsText(us);
            lg2 = IVString.MatchesRegex(us, IVString.regexLib("email"));
            lg3 = IVString.ContainsText(pw);

            if (lg1 && lg2 && lg3) {
                url = "/grpLst.jsp";

                cus.setUus(us);
                cus.setHus(ec.EC_dus(us));
                cus.setHpw(ec.EC_dpw(us));
                session.setAttribute("us", cus.getUus());
                session.setAttribute("pw", cus.getHpw());
            } else {
                url = "/index.jsp";
                if (!lg1 || !lg2) {
                    session.setAttribute("hd1", "");
                    if (!lg1) {
                        lgError1.add("An email was not entered.");
                    } else if (!lg2) {
                        lgError1.add("An invalid email was entered.");
                    }
                }
                if (!lg3) {
                    lgError1.add("A password was not entered.");
                }
                session.setAttribute("er1", lgError1);

            }

        } else if (action.equalsIgnoreCase("ev")) { //clicks event manager button
            url = "/evtlgn.jsp";
            session.setAttribute("hd1", "hidden");
            ArrayList<String> lgError1 = new ArrayList();
            session.setAttribute("er1", lgError1);

        } else if (action.equalsIgnoreCase("elg")) { //event manager login
            url = "/evtLst.jsp";
            session.setAttribute("hd1", "hidden");
            ArrayList<String> lgError1 = new ArrayList();
            session.setAttribute("er1", lgError1);
            uBase cus = new uBase();
            String us = request.getParameter("us");
            String pw = request.getParameter("pw");
            boolean lg1, lg2, lg3 = false;
            lg1 = IVString.ContainsText(us);
            lg2 = IVString.MatchesRegex(us, IVString.regexLib("email"));
            lg3 = IVString.ContainsText(pw);

            if (lg1 && lg2 && lg3) {
                url = "/evtLst.jsp";

                cus.setUus(us);
                cus.setHus(ec.EC_dus(us));
                cus.setHpw(ec.EC_dpw(us));
                session.setAttribute("us", cus.getUus());
                session.setAttribute("pw", cus.getHpw());
            } else {
                url = "/evtlgn.jsp";
                if (!lg1 || !lg2) {
                    session.setAttribute("hd1", "");
                    if (!lg1) {
                        lgError1.add("An email was not entered.");
                    } else if (!lg2) {
                        lgError1.add("An invalid email was entered.");
                    }
                }
                if (!lg3) {
                    lgError1.add("A password was not entered.");
                }
                session.setAttribute("er1", lgError1);
            }
        } else {
            url = "index.jsp";
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
