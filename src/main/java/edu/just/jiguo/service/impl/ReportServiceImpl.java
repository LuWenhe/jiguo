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
    public List<Report> getAllReport() {
        List<Report> reports = reportMapper.getAllReport();
        return reports;
    }

    @Override
    public List<Report> getAllReportById(Integer reportId) {
        List<Report> reports = reportMapper.getAllReportById(reportId);
        System.out.println(reports);
        return reports;
    }

    @Override
    public boolean deleteReportById(Integer reportId) {
        boolean result = false;

        List<Report> report = reportMapper.getAllReportById(reportId);
        if(report.size() < 0){
            return result;
        }

        reportMapper.deleteReportById(reportId);
        result = true;
        return result;
    }

}
