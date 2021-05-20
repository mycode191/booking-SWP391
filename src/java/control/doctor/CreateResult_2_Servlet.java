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
import model.Result2;

/**
 *
 * @author HIEU19
 */
public class CreateResult_2_Servlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        request.setAttribute("date", date);
        DoctorDAO ddao = new DoctorDAO();
        ArrayList<Doctor> lsDoctor = ddao.getDoctors();
        request.setAttribute("doctor", lsDoctor);
        request.getRequestDispatcher("view/create-2.jsp").forward(request, response);
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
        
        ResultDAO dao = new ResultDAO();
        
        double hc = Double.parseDouble(request.getParameter("hc"));
        double hemo = Double.parseDouble(request.getParameter("hemo"));
        double hema = Double.parseDouble(request.getParameter("hema"));
        double reti = Double.parseDouble(request.getParameter("reti"));
        double sett = Double.parseDouble(request.getParameter("sett"));
        double flow = Double.parseDouble(request.getParameter("flow"));
        double pat = Double.parseDouble(request.getParameter("pat"));
        String type = request.getParameter("type");
        String code = request.getParameter("code");
        Date date = Date.valueOf(request.getParameter("date"));
        
        Result2 r2 = new Result2();
        
        r2.setHc(hc);
        r2.setHemoglobin(hemo);
        r2.setHemetocrit(hema);
        r2.setReticulocyte(reti);
        r2.setSettled_blood(sett);
        r2.setBlood(flow);
        r2.setPlatelet(pat);
        r2.setBlood_type(type);
        r2.setCode(code);
        r2.setDate(date);
        
        dao.add_rs2(r2);
        
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
