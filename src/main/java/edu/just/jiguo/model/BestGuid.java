package edu.just.jiguo.model;

import javax.persistence.*;

public class BestGuid {
    @Id
    @Column(name = "bestguid_id")
    private Integer bestguidId;

    private String pic;

    private String description;

    private Integer likes;

    private Integer assess;

    /**
     * @return bestguid_id
     */
    public Integer getBestguidId() {
        return bestguidId;
    }

    /**
     * @param bestguidId
     */
    public void setBestguidId(Integer bestguidId) {
        this.bestguidId = bestguidId;
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