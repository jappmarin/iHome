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
import javax.servlet.http.HttpSession;

public class Customer {

    private String username;
    private String firstname;
    private String lastname;
    private String birthdate;
    private String email;
    private String phone;
    private String password;
    private String customer_type;
    private Connection connection;

    public Customer(String username) {
        this.username = username;
    }

    public Customer(Connection connection, String username) throws SQLException {
        this.username = username;
        this.connection = connection;

        PreparedStatement select_customer = connection.prepareStatement("select * from test_base.customer where username = ? and password = ?");
        select_customer.setString(1, username);
        select_customer.setString(2, password);
        ResultSet display_customer = select_customer.executeQuery();

        if (display_customer.next()) {
            this.username = display_customer.getString("username");
            this.password = display_customer.getString("password");
            this.firstname = display_customer.getString("f_name");
            this.lastname = display_customer.getString("l_name");
            this.birthdate = display_customer.getString("birth_date");
            this.email = display_customer.getString("email");
            this.phone = display_customer.getString("phone");
            this.customer_type = display_customer.getString("customer_type");
        }
    }

    public void addNewCustomer(Connection connection) throws SQLException {
        PreparedStatement insert_customer = connection.prepareStatement("insert into test_base.customer (username, password, f_name, l_name, email, birth_date, phone, customer_type) values (?, ?, ?, ?, ?, ?, ?, ?)");
        insert_customer.setString(1, this.username);
        insert_customer.setString(2, this.password);
        insert_customer.setString(3, this.firstname);
        insert_customer.setString(4, this.lastname);
        insert_customer.setString(5, this.email);
        insert_customer.setString(6, this.birthdate);
        insert_customer.setString(7, this.phone);
        insert_customer.setString(8, this.customer_type);
        insert_customer.executeUpdate();
    }

    public void editCustomer(Connection connection) throws SQLException {
        PreparedStatement update_customer = connection.prepareStatement("update test_base.customer set f_name = ?, l_name = ?, email = ?, phone = ? where username = ?");
        update_customer.setString(1, this.getFirstname());
        update_customer.setString(2, this.getLastname());
        update_customer.setString(3, this.getEmail());
        update_customer.setString(4, this.getPhone());
        update_customer.executeUpdate();
    }

    public void changeFirstname(Connection connection) throws SQLException {
        PreparedStatement update_customer = connection.prepareStatement("update test_base.customer set f_name = ? where username = ?");
        update_customer.setString(1, firstname);
        update_customer.setString(2, username);
        update_customer.executeUpdate();
    }

    public void changeLastname(Connection connection) throws SQLException {
        PreparedStatement update_customer = connection.prepareStatement("update test_base.customer set l_name = ? where username = ?");
        update_customer.setString(1, lastname);
        update_customer.setString(2, username);
        update_customer.executeUpdate();
    }

    public void changeEmail(Connection connection) throws SQLException {
        PreparedStatement update_customer = connection.prepareStatement("update test_base.customer set email = ? where username = ?");
        update_customer.setString(1, email);
        update_customer.setString(2, username);
        update_customer.executeUpdate();
    }

    public void changePhone(Connection connection) throws SQLException {
        PreparedStatement update_customer = connection.prepareStatement("update test_base.customer set phone = ? where username = ?");
        update_customer.setString(1, phone);
        update_customer.setString(2, username);
        update_customer.executeUpdate();
    }

    public void changePassword(Connection connection) throws SQLException {
        PreparedStatement update_customer = connection.prepareStatement("update test_base.customer set password = ? where username = ?");
        update_customer.setString(1, password);
        update_customer.setString(2, username);
        update_customer.executeUpdate();
    }

    public boolean confirmPassword(Connection connection, String confirmPassword) throws SQLException {
        PreparedStatement select_customer = connection.prepareStatement("select password from test_base.customer where username = ? and password = ?");
        select_customer.setString(1, username);
        select_customer.setString(2, confirmPassword);
        ResultSet display_customer = select_customer.executeQuery();

        if (display_customer.next()) {
            return true;
        } else {
            return false;
        }

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

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
