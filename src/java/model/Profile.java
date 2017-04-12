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

public class Profile {

    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String password;
    private Connection connection;

    public Profile(Connection connection, String username) throws SQLException {
        this.username = username;
        this.connection = connection;

        PreparedStatement select_profile = connection.prepareStatement("select firstname, lastname, email, phone from customer where username = '" + username + "'");
        ResultSet display_profile = select_profile.executeQuery();

        if (display_profile.next()) {
            this.firstname = display_profile.getString("firstname");
            this.lastname = display_profile.getString("lastname");
            this.username = display_profile.getString("username");
            this.email = display_profile.getString("email");
            this.phone = display_profile.getString("phone");
        }
    }

    public void addNewProfile(Connection connection) throws SQLException {
        PreparedStatement insert_customer = connection.prepareStatement("insert into customer(username, firstname, lastname, email, phone, password) values (?,?,?,?,?,?)");
        insert_customer.setString(1, this.getUsername());
        insert_customer.setString(2, this.getFirstname());
        insert_customer.setString(3, this.getLastname());
        insert_customer.setString(4, this.getEmail());
        insert_customer.setString(5, this.getPhone());
        insert_customer.setString(6, this.getPassword());
        insert_customer.executeUpdate();
    }

    public void editProfile(Connection connection) throws SQLException {
        PreparedStatement update_customer = connection.prepareStatement("update customer set firstname = ?, lastname = ?, email = ?, phone = ? where username = ?");
        update_customer.setString(1, this.getFirstname());
        update_customer.setString(2, this.getLastname());
        update_customer.setString(3, this.getEmail());
        update_customer.setString(4, this.getPhone());
        update_customer.executeUpdate();
    }

    public Profile() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public void setLastname(String last_name) {
        this.lastname = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
