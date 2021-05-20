/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.doctor;

import dal.PatientDAO;
import dal.ResultDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Patient;
import model.Result;

/**
 *
 * @author HIEU19
 */
public class DoingSendCodeServlet extends HttpServlet {

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
        request.setCharacterEncoding("utf-8");
        String code = request.getParameter("code");
        int id = Integer.parseInt(request.getParameter("id"));
        int rid = Integer.parseInt(request.getParameter("rid"));
        PatientDAO dao = new PatientDAO();
        Patient p = dao.getPatientById(id);

        String toEmail = p.getEmail();
        String subject = "Medical code from General hospital of agriculture";
        String text = "Thank you for using our service.\nWe have already generate medical records for you.\nThe medical code is: " + code + "\nPlease go to http://localhost:8080/Project/search to see your record";
        new SendMail().sentEmail(toEmail, subject, text);

        ResultDAO rdao = new ResultDAO();
        rdao.update(rid);
        ArrayList<Result> lsRs = rdao.getRsbyStt();

        request.setAttribute("list", lsRs);
        request.getRequestDispatcher("view/sendcode.jsp").forward(request, response);

//        response.getWriter().println(code + "\n" + toEmail + "\n" +p.getName());
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
