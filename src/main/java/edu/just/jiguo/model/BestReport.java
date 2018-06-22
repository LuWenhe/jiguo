package edu.just.jiguo.model;

import java.util.Date;
import javax.persistence.*;

public class BestReport {
    @Id
    @Column(name = "bestreport_id")
    private Integer bestreportId;

    private String pic;

    private String description;

    private String customer;

    private Date date;

    private Integer likes;

    private Integer assess;

    @Column(name = "checkDetail")
    private String checkdetail;

    /**
     * @return bestreport_id
     */
    public Integer getBestreportId() {
        return bestreportId;
    }

    /**
     * @param bestreportId
     */
    public void setBestreportId(Integer bestreportId) {
        this.bestreportId = bestreportId;
    }

    /**
     * @return pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * @param pic
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer
     */
    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    /**
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return likes
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * @param likes
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     * @return assess
     */
    public Integer getAssess() {
        return assess;
    }

    /**
     * @param assess
     */
    public void setAssess(Integer assess) {
        this.assess = assess;
    }

    /**
     * @return checkDetail
     */
    public String getCheckdetail() {
        return checkdetail;
    }

    /**
     * @param checkdetail
     */
    public void setCheckdetail(String checkdetail) {
        this.checkdetail = checkdetail == null ? null : checkdetail.trim();
    }
}