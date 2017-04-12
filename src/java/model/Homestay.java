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

public class Homestay {
    private String hs_name;
    private String hs_desc;
    private float hs_price;
    private int hs_amount;
    private String hs_lat;
    private String hs_long;
    private String province;
    private String amphoe;
    private String tambon;
    private Connection connection;
    
    public Homestay(Connection connection, String homestayname) throws SQLException {
        this.hs_name = homestayname;
        this.connection = connection;
        
        PreparedStatement select_homestay = connection.prepareStatement("select hs_name, hs_price, hs_amount, hs_lat, hs_long from homestay where hs_name = '" + homestayname + "'");
        ResultSet display_homestay = select_homestay.executeQuery();

        if (display_homestay.next()) {
            this.hs_name = display_homestay.getString("hs_name");
            this.hs_price = display_homestay.getFloat("hs_price");
            this.hs_amount = display_homestay.getInt("hs_amount");
            this.hs_lat = display_homestay.getString("hs_lat");
            this.hs_long = display_homestay.getString("hs_long");
        }
    }
    
    public void addNewHomestay(Connection connection) throws SQLException {
        PreparedStatement insert_homestay = connection.prepareStatement("insert into homestay(hs_name, hs_price, hs_amount, hs_lat, hs_long) values (?,?,?,?,?)");
        insert_homestay.setString(1, this.getHs_name());
        insert_homestay.setFloat(2, this.getHs_price());
        insert_homestay.setInt(3, this.getHs_amount());
        insert_homestay.setString(4, this.getHs_lat());
        insert_homestay.setString(5, this.getHs_long());
        insert_homestay.executeUpdate();
    }
    public String getHs_name() {
        return hs_name;
    }

    public void setHs_name(String hs_name) {
        this.hs_name = hs_name;
    }

    public String getHs_desc() {
        return hs_desc;
    }

    public void setHs_desc(String hs_desc) {
        this.hs_desc = hs_desc;
    }

    public float getHs_price() {
        return hs_price;
    }

    public void setHs_price(float hs_price) {
        this.hs_price = hs_price;
    }

    public int getHs_amount() {
        return hs_amount;
    }

    public void setHs_amount(int hs_amount) {
        this.hs_amount = hs_amount;
    }

    public String getHs_lat() {
        return hs_lat;
    }

    public void setHs_lat(String hs_lat) {
        this.hs_lat = hs_lat;
    }

    public String getHs_long() {
        return hs_long;
    }

    public void setHs_long(String hs_long) {
        this.hs_long = hs_long;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAmphoe() {
        return amphoe;
    }

    public void setAmphoe(String amphoe) {
        this.amphoe = amphoe;
    }

    public String getTambon() {
        return tambon;
    }

    public void setTambon(String tambon) {
        this.tambon = tambon;
    }
}
