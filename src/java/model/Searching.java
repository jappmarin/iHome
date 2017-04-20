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
import java.util.ArrayList;

/**
 *
 * @author JAPP
 */
public class Searching {
    private String search;
    private String region;
    private Float min_price;
    private Float max_price;
    private String c_in;
    private String c_out;
    private ArrayList<Homestay> allHome;
    
    public Searching(){}
    
    public ArrayList<Homestay> Searching(Connection connection, String search) throws SQLException{
         ArrayList<Homestay> allHome = new ArrayList<>();

        PreparedStatement select_homestay_province = connection.prepareStatement("select * from test_base.homestay where homestay_province = ?");
        select_homestay_province.setString(1, search);
        ResultSet display_homestay_province = select_homestay_province.executeQuery();
        while (display_homestay_province.next()) {
            Homestay homestay = new Homestay();
            homestay.setHs_id(display_homestay_province.getString("homestay_id"));
            homestay.setHs_name(display_homestay_province.getString("homestay_name"));
            homestay.setHs_desc(display_homestay_province.getString("homestay_desc"));
            homestay.setHs_address(display_homestay_province.getString("homestay_address"));
            homestay.setHs_license(display_homestay_province.getString("homestay_license"));
            homestay.setHs_region(display_homestay_province.getString("homestay_region"));
            homestay.setHs_province(display_homestay_province.getString("homestay_province"));
            homestay.setHs_district(display_homestay_province.getString("homestay_district"));
            homestay.setHs_lat(display_homestay_province.getString("homestay_latitude"));
            homestay.setHs_long(display_homestay_province.getString("homestay_longitude"));
            allHome.add(homestay);
        }
        return allHome;
    }
}
