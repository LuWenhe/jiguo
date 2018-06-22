package edu.just.jiguo.dao;

import edu.just.jiguo.model.Report;
import edu.just.jiguo.util.MyMapper;

import java.util.List;

public interface ReportMapper extends MyMapper<Report> {

    public boolean addReport(Report report);
    public List<Report> getAllReports();
    public Report getReportById(Integer reportId);
    public boolean deleteReport(Integer reportId);
    public boolean updateReport(Report report);

}