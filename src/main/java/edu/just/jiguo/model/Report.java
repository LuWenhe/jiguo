package edu.just.jiguo.model;

import java.util.Date;
import javax.persistence.*;

public class Report {
    @Id
    @Column(name = "report_id")
    private Integer reportId;

    private String des;

    private String customer;

    private String pic;

    private Date date;

    private Integer likes;

    private Integer ass;

    private String more;

    /**
     * @return report_id
     */
    public Integer getReportId() {
        return reportId;
    }

    /**
     * @param reportId
     */
    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    /**
     * @return des
     */
    public String getDes() {
        return des;
    }

    /**
     * @param des
     */
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
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
     * @return ass
     */
    public Integer getAss() {
        return ass;
    }

    /**
     * @param ass
     */
    public void setAss(Integer ass) {
        this.ass = ass;
    }

    /**
     * @return more
     */
    public String getMore() {
        return more;
    }

    /**
     * @param more
     */
    public void setMore(String more) {
        this.more = more == null ? null : more.trim();
    }
}