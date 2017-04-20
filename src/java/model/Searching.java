/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
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
    
    public Searching(Connection connection, String search){
        
    }
}
