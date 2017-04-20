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

public class Room {

    private int room_id;
    private String room_name;
    private int room_limit;
    private float room_price;
    private String room_picture;
    private int homestay_id;
    private Connection connection;
    
    public Room(){
        
    }

    public Room(int room_id) {
        this.room_id = room_id;
    }

    public Room(Connection connection, String room_name) throws SQLException {
        this.room_name = room_name;
        this.connection = connection;
        
        PreparedStatement select_room = connection.prepareStatement("select * from test_base.room where room_name = ?");
        select_room.setString(1, room_name);
        ResultSet display_room = select_room.executeQuery();
        if (display_room.next()) {
            this.room_id = display_room.getInt("room_id");
            this.room_name = display_room.getString("room_name");
            this.room_limit = display_room.getInt("room_limit");
            this.room_price = display_room.getFloat("room_price");
            this.room_picture = display_room.getString("room_picture");
            this.homestay_id = display_room.getInt("homestay_id");
        }

    }

    public void addNewRoom(Connection connection) throws SQLException {
        PreparedStatement insert_room = connection.prepareStatement("insert into test_base.room (room_name, room_limit, room_price, room_picture, homestay_id) values (?,?,?,?,?)");
        insert_room.setString(1, this.getRoom_name());
        insert_room.setInt(2, this.getRoom_limit());
        insert_room.setFloat(3, this.getRoom_price());
        insert_room.setString(4,"pic.jpg");
        insert_room.setInt(5, this.getHomestay_id());
        insert_room.executeUpdate();
    }

    public void changeRoom_name(Connection connection) throws SQLException {
        PreparedStatement update_room = connection.prepareStatement("update test_base.room set room_name = ? where room_id = ?");
        update_room.setString(1, this.getRoom_name());
        update_room.setInt(2, this.getRoom_id());
        update_room.executeUpdate();
    }

    public void changeRoom_limit(Connection connection) throws SQLException {
        PreparedStatement update_room = connection.prepareStatement("update test_base.room set room_limit = ? where room_id = ?");
        update_room.setInt(1, this.getRoom_limit());
        update_room.setInt(2, this.getRoom_id());
        update_room.executeUpdate();
    }

    public void changeRoom_price(Connection connection) throws SQLException {
        PreparedStatement update_room = connection.prepareStatement("update test_base.room set room_price = ? where room_id = ?");
        update_room.setFloat(1, this.getRoom_price());
        update_room.setInt(2, this.getRoom_id());
        update_room.executeUpdate();
    }

    public void changeRoom_picture(Connection connection) throws SQLException {
        PreparedStatement update_room = connection.prepareStatement("update test_base.room set room_picture = ? where room_id = ?");
        update_room.setString(1, this.getRoom_picture());
        update_room.setInt(2, this.getRoom_id());
        update_room.executeUpdate();
    }

    public void changeHomestay_id(Connection connection) throws SQLException {
        PreparedStatement update_room = connection.prepareStatement("update test_base.room set homestay_id = ? where room_id = ?");
        update_room.setInt(1, this.getHomestay_id());
        update_room.setInt(2, this.getRoom_id());
        update_room.executeUpdate();
    }
    
    public void addRoom_facilities(Connection connection, int room_id, int fac_id) throws SQLException{
        PreparedStatement insert_fac = connection.prepareStatement("insert into test_base.room_fac(room_id, fac_id, unit) value(?, ?, ?)");
        insert_fac.setInt(1, room_id);
        insert_fac.setInt(2, fac_id);
        insert_fac.setInt(3, 0);
        insert_fac.executeUpdate();
    }

    /**
     * @return the room_name
     */
    public String getRoom_name() {
        return room_name;
    }

    /**
     * @param room_name the room_name to set
     */
    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    /**
     * @return the room_limit
     */
    public int getRoom_limit() {
        return room_limit;
    }

    /**
     * @param room_limit the room_limit to set
     */
    public void setRoom_limit(int room_limit) {
        this.room_limit = room_limit;
    }

    /**
     * @return the room_price
     */
    public float getRoom_price() {
        return room_price;
    }

    /**
     * @param room_price the room_price to set
     */
    public void setRoom_price(float room_price) {
        this.room_price = room_price;
    }

    /**
     * @return the room_pic
     */
    public String getRoom_picture() {
        return room_picture;
    }

    /**
     * @param room_pic the room_pic to set
     */
    public void setRoom_picture(String room_pic) {
        this.room_picture = room_picture;
    }

    /**
     * @return the homestay_id
     */
    public int getHomestay_id() {
        return homestay_id;
    }

    /**
     * @param homestay_id the homestay_id to set
     */
    public void setHomestay_id(int homestay_id) {
        this.homestay_id = homestay_id;
    }

    /**
     * @return the room_id
     */
    public int getRoom_id() {
        return room_id;
    }

    /**
     * @param room_id the room_id to set
     */
    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

}
