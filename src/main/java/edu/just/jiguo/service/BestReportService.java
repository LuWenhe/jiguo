package edu.just.jiguo.service;

import edu.just.jiguo.model.BestReport;

import java.util.List;

public interface BestReportService {

    public boolean addBestReport(BestReport bestReport);
    public BestReport getBestReportById(Integer bestReportId);
    public List<BestReport> getAllBestReports();
    public boolean deleteBestReport(Integer bestReportId);
    public boolean updateBestReport(BestReport bestReport);
}
