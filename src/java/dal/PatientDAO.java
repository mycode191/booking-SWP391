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
import model.Patient;

/**
 *
 * @author HIEU19
 */
public class PatientDAO extends DBContext {

    public ArrayList<Patient> getPatients() {

        String sql = "select * from patient";
        ArrayList<Patient> patient = new ArrayList<>();
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Patient p = new Patient();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setAge(rs.getInt(3));
                p.setAddress(rs.getString(4));
                p.setPhone(rs.getString(5));
                p.setCode(rs.getString(6));
                p.setOption(rs.getString(7));
                p.setGender(rs.getBoolean(8));
                p.setEmail(rs.getString(9));
                patient.add(p);

            }

        } catch (SQLException e) {
        }
        return patient;
    }

    public Patient getPatientByCode(String code) {
        try {
            String sql = "SELECT * FROM patient where code = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, code);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Patient p = new Patient();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setAge(rs.getInt(3));
                p.setAddress(rs.getString(4));
                p.setPhone(rs.getString(5));
                p.setCode(rs.getString(6));
                p.setOption(rs.getString(7));
                p.setGender(rs.getBoolean(8));
           
                return p;
            }
        } catch (SQLException ex) {
        }
        return null;
    }

    public Patient getPatientById(int id) {
        try {
            String sql = "SELECT * FROM patient where id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Patient p = new Patient();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setAge(rs.getInt(3));
                p.setAddress(rs.getString(4));
                p.setPhone(rs.getString(5));
                p.setCode(rs.getString(6));
                p.setOption(rs.getString(7));
                p.setGender(rs.getBoolean(8));
                p.setEmail(rs.getString(9));
                return p;
            }
        } catch (SQLException ex) {
        }
        return null;
    }

    public void add(Patient p) {
        try {
            String sql = "INSERT INTO Patient VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, p.getId());
            stm.setString(2, p.getName());
            stm.setInt(3, p.getAge());
            stm.setString(4, p.getAddress());
            stm.setString(5, p.getPhone());
            stm.setString(6, p.getCode());
            stm.setString(7, p.getOption());
            stm.setBoolean(8, p.isGender());
            stm.setString(9, p.getEmail());
            stm.executeUpdate();
        } catch (SQLException ex) {
        }
    }
    
    public static void main(String[] args) {
        System.out.println(new PatientDAO().getPatientById(6));
    }
}
