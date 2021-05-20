/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Result;
import model.Result1;
import model.Result2;


/**
 *
 * @author HIEU19
 */
public class ResultDAO extends DBContext {

    public Result getResultsByCode(String code) {
        try {
            String sql = "SELECT * FROM result where code = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, code);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Result r = new Result();
                r.setId(rs.getInt(1));
                r.setPid(rs.getInt(2));
                r.setPname(rs.getString(3));
                r.setHepa(rs.getString(4));
                r.setPanc(rs.getString(5));
                r.setRein(rs.getString(6));
                r.setBlad(rs.getString(7));
                r.setOther(rs.getString(8));
                r.setF_rs(rs.getString(9));
                r.setCode(rs.getString(10));
                r.setDate(rs.getDate(11));
                r.setDoctor_id(rs.getInt(12));
                r.setStatus(rs.getInt(13));
                return r;
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    
    
       public Result getResultsByID(int id) {
        try {
            String sql = "SELECT * FROM result where id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Result r = new Result();
                r.setId(rs.getInt(1));
                r.setPid(rs.getInt(2));
                r.setPname(rs.getString(3));
                r.setHepa(rs.getString(4));
                r.setPanc(rs.getString(5));
                r.setRein(rs.getString(6));
                r.setBlad(rs.getString(7));
                r.setOther(rs.getString(8));
                r.setF_rs(rs.getString(9));
                r.setCode(rs.getString(10));
                r.setDate(rs.getDate(11));
                r.setDoctor_id(rs.getInt(12));
                r.setStatus(rs.getInt(13));
                return r;
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    
      public void delete(int id) {
        String sql = "DELETE FROM Result WHERE id = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);;
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
         
        }
    }
      
       public void delete1(String code) {
        String sql = "DELETE FROM result1 WHERE code = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);;
            stm.setString(1, code);
            stm.executeUpdate();
        } catch (SQLException ex) {
         
        }
    }
       
        public void delete2(String code) {
        String sql = "DELETE FROM result2 WHERE code = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);;
            stm.setString(1, code);
            stm.executeUpdate();
        } catch (SQLException ex) {
         
        }
    }
    
    public ArrayList<Result> getRsbyStt() {

        String sql = "select * from Result where status = 0;";
        ArrayList<Result> res = new ArrayList<>();
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Result r = new Result();
                r.setId(rs.getInt(1));
                r.setPid(rs.getInt(2));
                r.setPname(rs.getString(3));
                r.setHepa(rs.getString(4));
                r.setPanc(rs.getString(5));
                r.setRein(rs.getString(6));
                r.setBlad(rs.getString(7));
                r.setOther(rs.getString(8));
                r.setF_rs(rs.getString(9));
                r.setCode(rs.getString(10));
                r.setDate(rs.getDate(11));
                r.setDoctor_id(rs.getInt(12));
                r.setStatus(rs.getInt(13));
                res.add(r);
            }

        } catch (SQLException e) {
        }
        return res;
    }
    

    
    
    public void update(int id){
        try {
            String sql = "update result set status = 1 where id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    
   public void update(Result r, int id) {
        String sql = "UPDATE Result SET patient_name = ?, hepatobiliary = ?, pancreas = ?, reins = ?, bladder = ?, other = ?, final_result = ?, date = ?, doctor_id = ? WHERE id = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, r.getPname());
            stm.setString(2, r.getHepa());
            stm.setString(3, r.getPanc());
            stm.setString(4, r.getRein());
            stm.setString(5, r.getBlad());
            stm.setString(6, r.getOther());
            stm.setString(7, r.getF_rs());
            stm.setDate(8, r.getDate());
            stm.setInt(9, r.getDoctor_id());
            stm.setInt(10, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
          
        }
    }

    public Result1 getResults1ByCode(String code) {
        try {
            String sql = "SELECT * FROM result1 where code = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, code);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Result1 r = new Result1();
                r.setId(rs.getInt(1));
                r.setUre(rs.getDouble(2));
                r.setGlucose(rs.getDouble(3));
                r.setCreatinine(rs.getDouble(4));
                r.setAcid_uric(rs.getDouble(5));
                r.setProtein(rs.getDouble(6));
                r.setCholesterol(rs.getDouble(7));
                r.setCalcium(rs.getDouble(8));
                r.setPh(rs.getDouble(9));
                r.setCode(rs.getString(10));
                r.setDate(rs.getDate(11));
                return r;
            }
        } catch (SQLException ex) {
        }
        return null;
    }

    public Result2 getResults2ByCode(String code) {
        try {
            String sql = "SELECT * FROM result2 where code = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, code);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Result2 r = new Result2();
                r.setId(rs.getInt(1));
                r.setHc(rs.getDouble(2));
                r.setHemoglobin(rs.getDouble(3));
                r.setHemetocrit(rs.getDouble(4));
                r.setReticulocyte(rs.getDouble(5));
                r.setSettled_blood(rs.getDouble(6));
                r.setBlood(rs.getDouble(7));
                r.setPlatelet(rs.getDouble(8));
                r.setBlood_type(rs.getString(9));
                r.setDate(rs.getDate(10));
                r.setCode(rs.getString(11));
                return r;
            }
        } catch (SQLException ex) {
        }
        return null;
    }

    public ArrayList<Result> getRs() {

        String sql = "select * from Result";
        ArrayList<Result> res = new ArrayList<>();
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Result r = new Result();
                r.setId(rs.getInt(1));
                r.setPid(rs.getInt(2));
                r.setPname(rs.getString(3));
                r.setHepa(rs.getString(4));
                r.setPanc(rs.getString(5));
                r.setRein(rs.getString(6));
                r.setBlad(rs.getString(7));
                r.setOther(rs.getString(8));
                r.setF_rs(rs.getString(9));
                r.setCode(rs.getString(10));
                r.setDate(rs.getDate(11));
                r.setDoctor_id(rs.getInt(12));
                r.setStatus(rs.getInt(13));
                res.add(r);
            }

        } catch (SQLException e) {
        }
        return res;
    }

    public ArrayList<Result1> getRs1() {

        String sql = "select * from Result1";
        ArrayList<Result1> res = new ArrayList<>();
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Result1 r = new Result1();
                r.setId(rs.getInt(1));
                r.setUre(rs.getDouble(2));
                r.setGlucose(rs.getDouble(3));
                r.setCreatinine(rs.getDouble(4));
                r.setAcid_uric(rs.getDouble(5));
                r.setProtein(rs.getDouble(6));
                r.setCholesterol(rs.getDouble(7));
                r.setCalcium(rs.getDouble(8));
                r.setPh(rs.getDouble(9));
                r.setCode(rs.getString(10));
                r.setDate(rs.getDate(11));
                res.add(r);
            }

        } catch (SQLException e) {
        }
        return res;
    }

    public ArrayList<Result2> getRs2() {

        String sql = "select * from Result2";
        ArrayList<Result2> res = new ArrayList<>();
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Result2 r = new Result2();
                r.setId(rs.getInt(1));
                r.setHc(rs.getDouble(2));
                r.setHemoglobin(rs.getDouble(3));
                r.setHemetocrit(rs.getDouble(4));
                r.setReticulocyte(rs.getDouble(5));
                r.setSettled_blood(rs.getDouble(6));
                r.setBlood(rs.getDouble(7));
                r.setPlatelet(rs.getDouble(8));
                r.setBlood_type(rs.getString(9));
                r.setDate(rs.getDate(10));
                r.setCode(rs.getString(11));
                res.add(r);
            }

        } catch (SQLException e) {
        }
        return res;
    }
    
    public void add(Result r) {
        try {
            String sql = "INSERT INTO Result VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setInt(1, r.getPid());
            stm.setString(2, r.getPname());
            stm.setString(3, r.getHepa());
            stm.setString(4, r.getPanc());
            stm.setString(5, r.getRein());
            stm.setString(6, r.getBlad());
            stm.setString(7, r.getOther());
            stm.setString(8, r.getF_rs());
            stm.setString(9, r.getCode());
            stm.setDate(10, r.getDate());
            stm.setInt(11, r.getDoctor_id());
            stm.setInt(12, r.getStatus());
            stm.executeUpdate();
        } catch (SQLException ex) {
        }
    }
    
    
    public void add_rs1(Result1 r) {
        try {
            String sql = "INSERT INTO Result1 VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setDouble(1, r.getUre());
            stm.setDouble(2, r.getGlucose());
            stm.setDouble(3, r.getCreatinine());
            stm.setDouble(4, r.getAcid_uric());
            stm.setDouble(5, r.getProtein());
            stm.setDouble(6, r.getCholesterol());
            stm.setDouble(7, r.getCalcium());
            stm.setDouble(8, r.getPh());
            stm.setString(9, r.getCode());
            stm.setDate(10, r.getDate());
            stm.executeUpdate();
        } catch (SQLException ex) {
        }
    }
    
    
    public void add_rs2(Result2 r) {
        try {
            String sql = "INSERT INTO Result2 VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setDouble(1, r.getHc());
            stm.setDouble(2, r.getHemoglobin());
            stm.setDouble(3, r.getHemetocrit());
            stm.setDouble(4, r.getReticulocyte());
            stm.setDouble(5, r.getSettled_blood());
            stm.setDouble(6, r.getBlood());
            stm.setDouble(7, r.getPlatelet());
            stm.setString(8, r.getBlood_type());
            stm.setDate(9, r.getDate());
            stm.setString(10, r.getCode());
            stm.executeUpdate();
        } catch (SQLException ex) {
        }
    }
 
    
    public static void main(String[] args) {
//        Result1 r1 = new Result1();
//        r1.setUre(23);
//        r1.setGlucose(34);
//        r1.setCreatinine(23);
//        r1.setAcid_uric(12);
//        r1.setProtein(23);
//        r1.setCholesterol(43);
//        r1.setCalcium(54);
//        r1.setPh(7);
//        r1.setCode("UD936V8D");
//        r1.setDate(Date.valueOf("2021-03-26"));
//        
//        
//        Result2 r2 = new Result2();
//        
//        r2.setHc(12);
//        r2.setHemoglobin(12);
//        r2.setHemetocrit(12);
//        r2.setReticulocyte(12);
//        r2.setSettled_blood(12);
//        r2.setBlood(12);
//        r2.setPlatelet(12);
//        r2.setBlood_type("O");
//        r2.setCode("UD936V8D");
//        r2.setDate(Date.valueOf("2021-03-26"));
//        
//        new ResultDAO().add_rs2(r2);



    }
}
