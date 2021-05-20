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
import model.Account;

/**
 *
 * @author HIEU19
 */
public class AccountDAO extends DBContext{
    public ArrayList<Account> getAll(){
        String sql = "select * from account";
        ArrayList<Account> accs = new ArrayList<>();
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Account a = new Account();
                a.setId(rs.getInt("id"));
                a.setUsername(rs.getString("user"));
                a.setPassword(rs.getString("password"));
                a.setRole(rs.getInt("role"));
                accs.add(a);
            }
        } catch (SQLException e) {
            
        }
        return accs;
    }
    
    public Account checkLogin(String user, String pass){
        String sql = "Select * from account where [user] = ? and password = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user);
            stm.setString(2, pass);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Account a = new Account();
                a.setId(rs.getInt("id"));
                a.setUsername(rs.getString("user"));
                a.setPassword(rs.getString("password"));
                a.setRole(rs.getInt("role"));
                return a;
            }
        } catch (SQLException e) {
        }
        return null;
    }
    
      public void insert(String user, String pass){
        String sql = "insert into account values (?, ?, ?)";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user);
            stm.setString(2, pass);
            stm.setInt(3, 1);
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }
   
    public Account checkUser(String user){
        String sql = "select * from account where [user] = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user);
            ResultSet rs = stm.executeQuery();
            while (rs.next()){
                Account a = new Account();
                a.setId(rs.getInt("id"));
                a.setUsername(rs.getString("user"));
                a.setPassword(rs.getString("password"));
                a.setRole(rs.getInt("role"));
                return a;
            }    
        } catch (SQLException e) {
        }
        return null;
    }
    
    public void changePass(){
        
    }
    
    
    public static void main(String[] args) {
        
    }
}
