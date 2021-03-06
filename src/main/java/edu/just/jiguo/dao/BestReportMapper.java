package edu.just.jiguo.dao;

import edu.just.jiguo.model.BestReport;
import edu.just.jiguo.util.MyMapper;

import java.util.List;

public interface BestReportMapper extends MyMapper<BestReport> {

    public boolean addBestReport(BestReport bestReport);
    public BestReport getBestReportById(Integer bestReportId);
    public List<BestReport> getAllBestReports();
    public boolean deleteBestReport(Integer bestReportId);
    public boolean updateBestReport(BestReport bestReport);
}