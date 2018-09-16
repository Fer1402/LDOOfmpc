/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osnap
 */
@WebServlet(urlPatterns = {"/FS3"})
public class FS3 extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            response.setContentType("text/html;charset=UTF-8");
            out.println("<head>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<strong><h1>LOS DATOS INGRESADOS SON:</h1></strong>");
            out.println("<strong>Primer Nombre:</strong>"); out.println(request.getParameter("PN"));
            out.println("<br>");
            out.println("<strong>Segundo Nombre:</strong>"); out.println(request.getParameter("SN"));
            out.println("<br>");
            out.println("<strong>Primer Apellido:</strong>"); out.println(request.getParameter("PA"));
            out.println("<br>");
            out.println("<strong>Segundo Apellido:</strong>"); out.println(request.getParameter("SA"));
            out.println("<br>");
            out.println("<strong>Fecha de nacimiento:</strong>"); out.println(request.getParameter("F"));
            out.println("<br>");
            out.println("<strong>Correo:</strong>"); out.println(request.getParameter("EA"));
            out.println("<br>");
            out.println("<strong>Contraseña:</strong>"); out.println(request.getParameter("PW"));
            out.println("</body>");
            out.println("</html>");
            
            
             
           
        }
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
        
        PrintWriter out = response.getWriter(); 
        
         
            
            request.getParameter("PN");
            request.getParameter("SN");
            request.getParameter("PA");
            request.getParameter("SA");
            request.getParameter("F");
            request.getParameter("EA");
            request.getParameter("PW");
           
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

