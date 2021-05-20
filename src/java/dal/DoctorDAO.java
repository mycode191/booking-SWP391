/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Doctor;


/**
 *
 * @author HIEU19
 */
public class DoctorDAO extends DBContext{
    public Doctor getDoctorById(int id) {
        try {
            String sql = "SELECT * FROM doctor where id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Doctor r = new Doctor();
                r.setId(rs.getInt(1));
                r.setName(rs.getString(2));
                r.setAge(rs.getInt(3));
                r.setLevel(rs.getString(4));
                r.setPhone(rs.getString(5));
                r.setAddress(rs.getString(6));
                r.setImage(rs.getString(7));
                r.setSign(rs.getString(8));
                return r;
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    
    public ArrayList<Doctor> getDoctors() {
        ArrayList<Doctor> doctors = new ArrayList<>();
        try {
            String sql = "SELECT * FROM doctor";
            
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Doctor r = new Doctor();
                r.setId(rs.getInt(1));
                r.setName(rs.getString(2));
                r.setAge(rs.getInt(3));
                r.setLevel(rs.getString(4));
                r.setPhone(rs.getString(5));
                r.setAddress(rs.getString(6));
                r.setImage(rs.getString(7));
                r.setSign(rs.getString(8));
                doctors.add(r);
            }
        } catch (SQLException ex) { 
        }
        return doctors;
    }
    
    public static void main(String[] args) {
        System.out.println(new DoctorDAO().getDoctors());
    }
}
