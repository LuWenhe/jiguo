package edu.just.jiguo.model;

import javax.persistence.*;

public class HotTiYan {
    @Id
    private Integer hottiyan;

    private String type;

    private String pic;

    private String description;

    private String price;

    private String count;

    private String apply;

    private String last;

    /**
     * @return hottiyan
     */
    public Integer getHottiyan() {
        return hottiyan;
    }

    /**
     * @param hottiyan
     */
    public void setHottiyan(Integer hottiyan) {
        this.hottiyan = hottiyan;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
     * @return count
     */
    public String getCount() {
        return count;
    }

    /**
     * @param count
     */
    public void setCount(String count) {
        this.count = count == null ? null : count.trim();
    }

    /**
     * @return apply
     */
    public String getApply() {
        return apply;
    }

    /**
     * @param apply
     */
    public void setApply(String apply) {
        this.apply = apply == null ? null : apply.trim();
    }

    /**
     * @return last
     */
    public String getLast() {
        return last;
    }

    /**
     * @param last
     */
    public void setLast(String last) {
        this.last = last == null ? null : last.trim();
    }
}