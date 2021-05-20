/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HIEU19
 */
public class Doctor {
    private int id;
    private String name;
    private int age;
    private String level;
    private String phone;
    private String address;
    private String image;
    private String sign;
    
    public Doctor() {
    }

    public Doctor(int id, String name, int age, String level, String phone, String address, String image, String sign) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.level = level;
        this.phone = phone;
        this.address = address;
        this.image = image;
        this.sign = sign;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", name=" + name + ", age=" + age + ", level=" + level + ", phone=" + phone + ", address=" + address + ", image=" + image + ", sign=" + sign + '}';
    }
    
    
    
}
