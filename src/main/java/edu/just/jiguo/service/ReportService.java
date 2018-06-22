package edu.just.jiguo.service;

import edu.just.jiguo.model.Report;

import java.util.List;

public interface ReportService {

    public boolean addReport(Report report);
    public List<Report> getAllReports();
    public Report getReportById(Integer reportId);
    public boolean deleteReport(Integer reportId);
    public boolean updateReport(Report report);

}
