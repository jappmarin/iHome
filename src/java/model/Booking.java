/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tkitb
 */
public class Booking {
    private int book_id;
    private String check_in;
    private String check_out;
    private int night;
    private float total;
    private String customer_id;
    private String room_id;

    /**
     * @return the book_id
     */
    public int getBook_id() {
        return book_id;
    }

    /**
     * @param book_id the book_id to set
     */
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    /**
     * @return the check_in
     */
    public String getCheck_in() {
        return check_in;
    }

    /**
     * @param check_in the check_in to set
     */
    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    /**
     * @return the check_out
     */
    public String getCheck_out() {
        return check_out;
    }

    /**
     * @param check_out the check_out to set
     */
    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    /**
     * @return the night
     */
    public int getNight() {
        return night;
    }

    /**
     * @param night the night to set
     */
    public void setNight(int night) {
        this.night = night;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the customer_id
     */
    public String getCustomer_id() {
        return customer_id;
    }

    /**
     * @param customer_id the customer_id to set
     */
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * @return the room_id
     */
    public String getRoom_id() {
        return room_id;
    }

    /**
     * @param room_id the room_id to set
     */
    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }
    
    
}
