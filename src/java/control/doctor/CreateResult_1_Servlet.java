/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.doctor;

import dal.DoctorDAO;
import dal.ResultDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Doctor;
import model.Result1;

/**
 *
 * @author HIEU19
 */
public class CreateResult_1_Servlet extends HttpServlet {

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
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        request.setAttribute("date", date);
        DoctorDAO ddao = new DoctorDAO();
        ArrayList<Doctor> lsDoctor = ddao.getDoctors();
        request.setAttribute("doctor", lsDoctor);
        request.getRequestDispatcher("view/create-1.jsp").forward(request, response);
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
        ResultDAO rdao = new ResultDAO();
        
        double ure = Double.parseDouble(request.getParameter("ure"));
        double glu = Double.parseDouble(request.getParameter("glucose"));
        double cre = Double.parseDouble(request.getParameter("creatinine"));
        double acid = Double.parseDouble(request.getParameter("uric"));
        double pro = Double.parseDouble(request.getParameter("protein"));
        double cho = Double.parseDouble(request.getParameter("cho"));
        double cal = Double.parseDouble(request.getParameter("calcium"));
        double ph = Double.parseDouble(request.getParameter("ph"));
        String code = request.getParameter("code");
        Date date = Date.valueOf(request.getParameter("date"));
        
        Result1 r1 = new Result1();
        r1.setUre(ure);
        r1.setGlucose(glu);
        r1.setCreatinine(cre);
        r1.setAcid_uric(acid);
        r1.setProtein(pro);
        r1.setCholesterol(cho);
        r1.setCalcium(cal);
        r1.setPh(ph);
        r1.setCode(code);
        r1.setDate(date);
        
        rdao.add_rs1(r1);
        
        
        
        response.sendRedirect("nga3.jsp");
        
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
