package model;

public class Comment {
    private String username;
    private String hs_id;
    private String firstname;
    private String lastname;
    private String comment_date;
    private String text;

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
     * @return the hs_id
     */
    public String getHs_id() {
        return hs_id;
    }

    /**
     * @param hs_id the hs_id to set
     */
    public void setHs_id(String hs_id) {
        this.hs_id = hs_id;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the comment_date
     */
    public String getComment_date() {
        return comment_date;
    }

    /**
     * @param comment_date the comment_date to set
     */
    public void setComment_date(String comment_date) {
        this.comment_date = comment_date;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
    
}
