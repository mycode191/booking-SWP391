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
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Doctor;
import model.Result;

/**
 *
 * @author HIEU19
 */
public class UpdateResultDetail extends HttpServlet {

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
        int id = Integer.parseInt(request.getParameter("id"));
        ResultDAO dao = new ResultDAO();
        Result rs = dao.getResultsByID(id);
        DoctorDAO doc = new DoctorDAO();
        ArrayList<Doctor> docs = doc.getDoctors();
        request.setAttribute("doc", docs);
        request.setAttribute("list", rs);
        request.getRequestDispatcher("view/update-rs.jsp").forward(request, response);
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

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String hepa = request.getParameter("hepa");
        String panc = request.getParameter("panc");
        String rein = request.getParameter("rein");
        String blad = request.getParameter("blad");
        String other = request.getParameter("other");
        String f = request.getParameter("f");

        Date date = Date.valueOf(request.getParameter("date"));
        int doc_id = Integer.parseInt(request.getParameter("doc_id"));

        Result r = new Result();

        r.setPname(name);
        r.setHepa(hepa);
        r.setPanc(panc);
        r.setRein(rein);
        r.setBlad(blad);
        r.setOther(other);
        r.setF_rs(f);

        r.setDate(date);
        r.setDoctor_id(doc_id);

        ResultDAO rdao = new ResultDAO();
        rdao.update(r, id);

        response.sendRedirect("success.jsp");
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
