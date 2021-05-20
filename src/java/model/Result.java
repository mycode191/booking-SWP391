/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author HIEU19
 */
public class Result {
    private int id;
    private int pid;
    private String pname;
    private String hepa;
    private String panc;
    private String rein;
    private String blad;
    private String other;
    private String f_rs;
    private int doctor_id;
    private String code;
    private Date date;
    private int status;
    
    public Result() {
    }

    public Result(int id, int pid, String pname, String hepa, String panc, String rein, String blad, String other, String f_rs, int doctor_id, String code, Date date, int status) {
        this.id = id;
        this.pid = pid;
        this.pname = pname;
        this.hepa = hepa;
        this.panc = panc;
        this.rein = rein;
        this.blad = blad;
        this.other = other;
        this.f_rs = f_rs;
        this.doctor_id = doctor_id;
        this.code = code;
        this.date = date;
        this.status = status;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getHepa() {
        return hepa;
    }

    public void setHepa(String hepa) {
        this.hepa = hepa;
    }

    public String getPanc() {
        return panc;
    }

    public void setPanc(String panc) {
        this.panc = panc;
    }

    public String getRein() {
        return rein;
    }

    public void setRein(String rein) {
        this.rein = rein;
    }

    public String getBlad() {
        return blad;
    }

    public void setBlad(String blad) {
        this.blad = blad;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getF_rs() {
        return f_rs;
    }

    public void setF_rs(String f_rs) {
        this.f_rs = f_rs;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    
}
