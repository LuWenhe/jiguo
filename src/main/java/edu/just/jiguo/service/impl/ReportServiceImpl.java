package edu.just.jiguo.service.impl;

import edu.just.jiguo.dao.ReportMapper;
import edu.just.jiguo.model.Report;
import edu.just.jiguo.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("reportService")
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportMapper reportMapper;


    @Override
    public boolean addReport(Report report) {
        return reportMapper.addReport(report);
    }

    @Override
    public List<Report> getAllReports() {
        return reportMapper.getAllReports();
    }

    @Override
    public Report getReportById(Integer reportId) {
        return reportMapper.getReportById(reportId);
    }

    @Override
    public boolean deleteReport(Integer reportId) {
        return reportMapper.deleteReport(reportId);
    }

    @Override
    public boolean updateReport(Report report) {
        return reportMapper.updateReport(report);
    }
}
