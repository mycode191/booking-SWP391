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
public class Result2 {

    private int id;
    private double hc;
    private double hemoglobin;
    private double hemetocrit;
    private double reticulocyte;
    private double settled_blood;
    private double blood;
    private double platelet;
    private String blood_type;
    private Date date;
    private String code;

    public Result2() {
    }

    public Result2(int id, double hc, double hemoglobin, double hemetocrit, double reticulocyte, double settled_blood, double blood, double platelet, String blood_type, Date date, String code) {
        this.id = id;
        this.hc = hc;
        this.hemoglobin = hemoglobin;
        this.hemetocrit = hemetocrit;
        this.reticulocyte = reticulocyte;
        this.settled_blood = settled_blood;
        this.blood = blood;
        this.platelet = platelet;
        this.blood_type = blood_type;
        this.date = date;
        this.code = code;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHc() {
        return hc;
    }

    public void setHc(double hc) {
        this.hc = hc;
    }

    public double getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(double hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public double getHemetocrit() {
        return hemetocrit;
    }

    public void setHemetocrit(double hemetocrit) {
        this.hemetocrit = hemetocrit;
    }

    public double getReticulocyte() {
        return reticulocyte;
    }

    public void setReticulocyte(double reticulocyte) {
        this.reticulocyte = reticulocyte;
    }

    public double getSettled_blood() {
        return settled_blood;
    }

    public void setSettled_blood(double settled_blood) {
        this.settled_blood = settled_blood;
    }

    public double getBlood() {
        return blood;
    }

    public void setBlood(double blood) {
        this.blood = blood;
    }

    public double getPlatelet() {
        return platelet;
    }

    public void setPlatelet(double platelet) {
        this.platelet = platelet;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

 
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
