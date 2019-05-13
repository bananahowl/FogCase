/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

/**
 *
 * @author emils
 */
public class User {
  
    private String firstname,lastname,password,email,city,adress; 
    private int phone,zipcode, User_id;

    public User(String firstname, String lastname, String password, String email, String city, String adress, int phone, int zipcode, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.city = city;
        this.adress = adress;
        this.phone = phone;
        this.zipcode = zipcode;
        this.User_id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getId() {
        return User_id;
    }

    public void setId(int id) {
        this.User_id = id;
    }

    @Override
    public String toString() {
        return "User{" + "firstname=" + firstname + ", lastname=" + lastname + ", password=" + password + ", email=" + email + ", city=" + city + ", adress=" + adress + ", phone=" + phone + ", zipcode=" + zipcode + ", id=" + User_id + '}';
    }



    
    
}
