/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tkitb
 */
public class Profile {
    private String username;
    private String first_name;
    private String last_name;
    private String birthdate;
    private String email;
    private String phone;
    private String gender;
    private String id_number;
    private Connection connection;
    
    public Profile(Connection connection, String username) throws SQLException {
        this.username = username;
        this.connection = connection;
        
        PreparedStatement select_profile = connection.prepareStatement("select first_name, last_name, email, id_number, gender, phone from customer where username = '" + username + "'");
        ResultSet display_profile = select_profile.executeQuery();
        
        if (display_profile.next()) {
            this.first_name = display_profile.getString("first_name");
            this.last_name = display_profile.getString("last_name");
            this.birthdate = display_profile.getString("birthdate");
            this.email = display_profile.getString("email");
            this.gender = display_profile.getString("gender");
            this.id_number = display_profile.getString("id_number");
            this.phone = display_profile.getString("phone");
        }
    }
    
    public void addNewProfile(Connection connection) throws SQLException {
        PreparedStatement update_customer = connection.prepareStatement("insert into customer(username, first_name, last_name, email, id_number, gender, phone) values (?,?,?,?,?,?,?");
        update_customer.setString(1, this.getUsername());
        update_customer.setString(2, this.getFirst_name());
        update_customer.setString(3, this.getLast_name());
        update_customer.setString(4, this.getEmail());
        update_customer.setString(5, this.getId_number());
        update_customer.setString(6, this.getGender());
        update_customer.setString(7, this.getPhone());
        update_customer.executeUpdate();
    }
    
    public void editProfile(Connection connection) throws SQLException {
        PreparedStatement update_customer = connection.prepareStatement("update customer set first_name = ?, last_name = ?, birthdate = ? where username = ?");
        update_customer.setString(1, this.getFirst_name());
        update_customer.setString(2, this.getLast_name());
        update_customer.setString(3, this.getBirthdate());
        update_customer.setString(4, this.getUsername());
        update_customer.executeUpdate();
    }
    
    public Profile() {
        
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the birthdate
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the id_number
     */
    public String getId_number() {
        return id_number;
    }

    /**
     * @param id_number the id_number to set
     */
    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    /**
     * @return the connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
