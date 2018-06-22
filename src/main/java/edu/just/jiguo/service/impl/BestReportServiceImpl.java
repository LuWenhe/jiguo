package edu.just.jiguo.service.impl;

import edu.just.jiguo.dao.BestReportMapper;
import edu.just.jiguo.model.BestReport;
import edu.just.jiguo.service.BestReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bestReportService")
public class BestReportServiceImpl implements BestReportService {

    @Autowired
    private BestReportMapper bestReportMapper;

    @Override
    public boolean addBestReport(BestReport bestReport) {
        return bestReportMapper.addBestReport(bestReport);
    }

    @Override
    public BestReport getBestReportById(Integer bestReportId) {
        return bestReportMapper.getBestReportById(bestReportId);
    }

    @Override
    public List<BestReport> getAllBestReports() {
        return bestReportMapper.getAllBestReports();
    }

    @Override
    public boolean deleteBestReport(Integer bestReportId) {
        return bestReportMapper.deleteBestReport(bestReportId);
    }

    @Override
    public boolean updateBestReport(BestReport bestReport) {
        return bestReportMapper.updateBestReport(bestReport);
    }
}
