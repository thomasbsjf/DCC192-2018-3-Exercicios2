/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UFJF;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Aula2Servlet extends HttpServlet {

    String usuario, senha;

    public void init() {
        usuario = getInitParameter("usuario");
        senha = getInitParameter("senha");
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String usu = request.getParameter("usuario");
        String psw = request.getParameter("senha");

        try (PrintWriter out = response.getWriter()) {

            if (usu.equals(usuario)) {
                if (psw.equals(senha)) {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Exercícios Aula 2 - DCC192</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Exercícios Aula 2 - DCC192 </h1>");
                    out.println("<h1>Logado com sucesso!</h1>");
                    out.println("</body>");
                    out.println("</html>");
                }
            } else {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Exercícios Aula 2 - DCC192</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Usuário ou senha Inválido</h1>");
                out.println("</body>");
                out.println("</html>");

            }
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
