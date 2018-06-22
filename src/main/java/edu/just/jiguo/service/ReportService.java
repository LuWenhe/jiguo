package edu.just.jiguo.service;

import edu.just.jiguo.model.Report;

import java.util.List;

public interface ReportService {

    public List<Report> getAllReport();

    public List<Report> getAllReportById(Integer reportId);

    public boolean deleteReportById(Integer reportId);
}
