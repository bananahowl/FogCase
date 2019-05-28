/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * <h1> The user class </h1>
 * User class is used to be able to temp. store and send the value to the
 * database
 * <br> The class itself is more the beable to get the users register into and
 * store it to future use
 *
 * @author emils
 */
public class User {

    private int user_id;
    private String firstname;
    private String lastname;
    private String adress;
    private String city;
    private int zipcode;
    private int phone;
    private String email;
    private String password;

    /**
     * the User class takes several values to make a object
     *
     * @param firstname : STRING the first name of the user
     * @param lastname: STRING the last name of the user
     * @param adress : STRING the adress of the user
     * @param city : STRING the living city of the user
     * @param zipcode : INT zipcode to the users location
     * @param phone : INT the phone number of the user
     * @param email : STRING the email of the user
     * @param password : STRING the password for the user
     */
    public User(String firstname, String lastname, String adress, String city, int zipcode, int phone, String email, String password) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.city = city;
        this.zipcode = zipcode;
        this.adress = adress;
        this.phone = phone;
    }

    /**
     * Returns true if the object is equals to a MetalParts object
     *
     * @returns a condition which is either true or false.
     */
    @Override
    public boolean equals(Object obj) {
        User us = (User) obj;
        boolean status = false;
        if (this.firstname.equalsIgnoreCase(us.firstname)
                && this.lastname.equalsIgnoreCase(us.lastname)
                && this.adress.equalsIgnoreCase(us.adress)
                && this.city.equalsIgnoreCase(us.city)
                && this.zipcode == us.zipcode
                && this.phone == us.phone
                && this.email.equalsIgnoreCase(us.email)
                && this.password.equalsIgnoreCase(us.password)) {
            status = true;
        }
        return status;
    }
    
      /**
     * Returns true if the email is valid.
     *
     * @returns a condition which is either true or false.
     */
    public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
  
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
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
        return "User-" + "user_id:" + user_id + " firstname:" + firstname + " lastname:" + lastname + " adress:" + adress + " city:" + city + " zipcode:" + zipcode + " phone:" + phone + " email:" + email + " password:" + password + '\n';
    }

}
