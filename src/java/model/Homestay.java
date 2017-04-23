package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Homestay {

    private String hs_id;
    private String hs_pic;
    private String hs_name;
    private String hs_desc;
    private String hs_address;
    private String hs_license;
    private String hs_region;
    private String hs_province;
    private String hs_district;
    private String hs_lat;
    private String hs_long;
    private String host;
    private ArrayList<Room> myRoom;
    private Connection connection;

    public Homestay() {

    }

    public void OwnHomestay(Connection connection, String username) throws SQLException {
        this.setHost(username);
        this.setConnection(connection);

        PreparedStatement select_homestay = connection.prepareStatement("select * from test_base.homestay where username = ?");
        select_homestay.setString(1, username);
        ResultSet display_homestay = select_homestay.executeQuery();

        if (display_homestay.next()) {
            this.setHost(username);
            this.setHs_name(display_homestay.getString("homestay_name"));
            this.setHs_pic(display_homestay.getString("homestay_picture"));
            this.setHs_desc(display_homestay.getString("homestay_desc"));
            this.setHs_address(display_homestay.getString("homestay_address"));
            this.setHs_license(display_homestay.getString("homestay_license"));
            this.setHs_region(display_homestay.getString("homestay_region"));
            this.setHs_province(display_homestay.getString("homestay_province"));
            this.setHs_district(display_homestay.getString("homestay_district"));
            this.setHs_lat(display_homestay.getString("homestay_latitude"));
            this.setHs_long(display_homestay.getString("homestay_longitude"));
        }
    }

    public void addHomestay(Connection connection) throws SQLException {
        PreparedStatement insert_homestay = connection.prepareStatement("insert into test_base.homestay (homestay_name, homestay_desc, homestay_address, homestay_license, homestay_region, homestay_province, homestay_district, homestay_picture, username) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
        insert_homestay.setString(1, this.getHs_name());
        insert_homestay.setString(2, this.getHs_desc());
        insert_homestay.setString(3, this.getHs_address());
        insert_homestay.setString(4, this.getHs_license());
        insert_homestay.setString(5, this.getHs_region());
        insert_homestay.setString(6, this.getHs_province());
        insert_homestay.setString(7, this.getHs_district());
//        insert_homestay.setString(8, this.getHs_lat());
//        insert_homestay.setString(9, this.getHs_long());
        insert_homestay.setString(8, this.getHs_pic());
        insert_homestay.setString(9, this.getHost());
        insert_homestay.executeUpdate();
    }

    public void editHomestay(Connection connection, String username) throws SQLException {
        PreparedStatement update_homestay = connection.prepareStatement("update test_base.homestay set homestay_name = ?, homestay_desc = ?, homestay_address = ?, homestay_license = ?, homestay_region = ?, homestay_province = ?, homestay_district = ?, homestay_latitude = ?, homestay_longitude = ?, homestay_picture = ? where username = ?");
        update_homestay.setString(1, this.getHs_name());
        update_homestay.setString(2, this.getHs_desc());
        update_homestay.setString(3, this.getHs_address());
        update_homestay.setString(4, this.getHs_license());
        update_homestay.setString(5, this.getHs_region());
        update_homestay.setString(6, this.getHs_province());
        update_homestay.setString(7, this.getHs_district());
        update_homestay.setString(8, this.getHs_lat());
        update_homestay.setString(9, this.getHs_long());
        update_homestay.setString(10, this.getHs_pic());
        update_homestay.setString(11, this.getHost());
        update_homestay.executeUpdate();
    }

    public String getHs_id() {
        return hs_id;
    }

    public void setHs_id(String hs_id) {
        this.hs_id = hs_id;
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

    public String getHs_address() {
        return hs_address;
    }

    public void setHs_address(String hs_address) {
        this.hs_address = hs_address;
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

    public String getHs_province() {
        return hs_province;
    }

    public void setHs_province(String hs_province) {
        this.hs_province = hs_province;
    }

    public String getHs_region() {
        return hs_region;
    }

    public void setHs_region(String hs_region) {
        this.hs_region = hs_region;
    }

    public String getHs_district() {
        return hs_district;
    }

    public void setHs_district(String hs_district) {
        this.hs_district = hs_district;
    }

    public String getHs_license() {
        return hs_license;
    }

    public void setHs_license(String hs_license) {
        this.hs_license = hs_license;
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return the hs_pic
     */
    public String getHs_pic() {
        return hs_pic;
    }

    /**
     * @param hs_pic the hs_pic to set
     */
    public void setHs_pic(String hs_pic) {
        this.hs_pic = hs_pic;
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

    /**
     * @return the myRoom
     */
    public ArrayList<Room> getMyRoom() {
        return myRoom;
    }

    /**
     * @param connection
     * @param homestay_id
     * @throws java.sql.SQLException
     */
    public void setMyRoom(Connection connection, String homestay_id) throws SQLException {
        PreparedStatement select_myRoom = connection.prepareStatement("select * from test_base.room where homestay_id =" + homestay_id);
        ResultSet display_myRoom = select_myRoom.executeQuery();
        myRoom = new ArrayList<>();
        while (display_myRoom.next()) {           
            Room room = new Room(connection, display_myRoom.getString("room_name")); 
            myRoom.add(room);
        }

        this.myRoom = myRoom;
    }

}
