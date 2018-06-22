package edu.just.jiguo.model;

import javax.persistence.*;

public class KuWan {
    @Id
    @Column(name = "kuwan_id")
    private Integer kuwanId;

    private String pic;

    private String name;

    private String description;

    private String price;

    private String likes;

    private String assess;

    /**
     * @return kuwan_id
     */
    public Integer getKuwanId() {
        return kuwanId;
    }

    /**
     * @param kuwanId
     */
    public void setKuwanId(Integer kuwanId) {
        this.kuwanId = kuwanId;
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * @return price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * @return likes
     */
    public String getLikes() {
        return likes;
    }

    /**
     * @param likes
     */
    public void setLikes(String likes) {
        this.likes = likes == null ? null : likes.trim();
    }

    /**
     * @return assess
     */
    public String getAssess() {
        return assess;
    }

    /**
     * @param assess
     */
    public void setAssess(String assess) {
        this.assess = assess == null ? null : assess.trim();
    }
}