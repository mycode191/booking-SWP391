/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.doctor;

import dal.DoctorDAO;
import dal.PatientDAO;
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
import javax.servlet.http.HttpSession;
import model.Doctor;
import model.Patient;
import model.Result;

/**
 *
 * @author HIEU19
 */
public class CreateResultServlet extends HttpServlet {

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
        request.getRequestDispatcher("view/create-0.jsp").forward(request, response);
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
        PatientDAO pdao = new PatientDAO();
        ResultDAO rdao = new ResultDAO();

        int id = pdao.getPatients().size() + 1;
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        int age = Integer.parseInt(request.getParameter("age"));
        boolean gender = request.getParameter("gender").equals("male");
        String option = request.getParameter("option");
        String option_code = request.getParameter("option_code");
        if (!"insurance".equalsIgnoreCase(option)) {
            option_code = "";
        }

        String hepa = request.getParameter("hepa");
        String panc = request.getParameter("panc");
        String rein = request.getParameter("rein");
        String blad = request.getParameter("blad");
        String other = request.getParameter("other");
        String f = request.getParameter("f");
        String code = request.getParameter("code");
        Date date = Date.valueOf(request.getParameter("date"));
        int doc_id = Integer.parseInt(request.getParameter("doc_id"));
        String email = request.getParameter("email");

        if (email == null || email.length() == 0) {
            email = "";
        }

        Patient p = new Patient();
        p.setId(id);
        p.setName(name);
        p.setAge(age);
        p.setAddress(address);
        p.setCode(option_code);
        p.setOption(option.toUpperCase());
        p.setGender(gender);
        p.setPhone(phone);
        p.setEmail(email);

        pdao.add(p);

        HttpSession session = request.getSession();
        session.setAttribute("create_patient", p);

        Result r = new Result();

        r.setPid(id);
        r.setPname(name);
        r.setHepa(hepa);
        r.setPanc(panc);
        r.setRein(rein);
        r.setBlad(blad);
        r.setOther(other);
        r.setF_rs(f);
        r.setCode(code);
        r.setDate(date);
        r.setDoctor_id(doc_id);
        r.setStatus(0);
        rdao.add(r);

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
