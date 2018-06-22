package edu.just.jiguo.model;

import javax.persistence.*;

public class BestPlay {
    @Id
    @Column(name = "bestplay_id")
    private Integer bestplayId;

    private String pic;

    private String name;

    private String description;

    private String price;

    private Integer likes;

    private Integer assess;

    /**
     * @return bestplay_id
     */
    public Integer getBestplayId() {
        return bestplayId;
    }

    /**
     * @param bestplayId
     */
    public void setBestplayId(Integer bestplayId) {
        this.bestplayId = bestplayId;
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
}