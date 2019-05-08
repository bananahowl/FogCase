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
  
    private String firstname; 
    private String lastname;
    private String adress; 
    private String city;
    private int phone;
    private String email; 
    private String password;

    public User(String firstname, String lastname, String adress, String city, int phone, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.password = password;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "firstname=" + firstname + ", lastname=" + lastname + ", adress=" + adress + ", city=" + city + ", phone=" + phone + ", email=" + email + ", password=" + password + '}';
    }
    
    
}
