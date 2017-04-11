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

    /**
     * @return the hs_name
     */
    public String getHs_name() {
        return hs_name;
    }

    /**
     * @param hs_name the hs_name to set
     */
    public void setHs_name(String hs_name) {
        this.hs_name = hs_name;
    }

    /**
     * @return the hs_desc
     */
    public String getHs_desc() {
        return hs_desc;
    }

    /**
     * @param hs_desc the hs_desc to set
     */
    public void setHs_desc(String hs_desc) {
        this.hs_desc = hs_desc;
    }

    /**
     * @return the hs_price
     */
    public float getHs_price() {
        return hs_price;
    }

    /**
     * @param hs_price the hs_price to set
     */
    public void setHs_price(float hs_price) {
        this.hs_price = hs_price;
    }

    /**
     * @return the hs_amount
     */
    public int getHs_amount() {
        return hs_amount;
    }

    /**
     * @param hs_amount the hs_amount to set
     */
    public void setHs_amount(int hs_amount) {
        this.hs_amount = hs_amount;
    }

    /**
     * @return the hs_lat
     */
    public String getHs_lat() {
        return hs_lat;
    }

    /**
     * @param hs_lat the hs_lat to set
     */
    public void setHs_lat(String hs_lat) {
        this.hs_lat = hs_lat;
    }

    /**
     * @return the hs_long
     */
    public String getHs_long() {
        return hs_long;
    }

    /**
     * @param hs_long the hs_long to set
     */
    public void setHs_long(String hs_long) {
        this.hs_long = hs_long;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the amphoe
     */
    public String getAmphoe() {
        return amphoe;
    }

    /**
     * @param amphoe the amphoe to set
     */
    public void setAmphoe(String amphoe) {
        this.amphoe = amphoe;
    }

    /**
     * @return the tambon
     */
    public String getTambon() {
        return tambon;
    }

    /**
     * @param tambon the tambon to set
     */
    public void setTambon(String tambon) {
        this.tambon = tambon;
    }
}
