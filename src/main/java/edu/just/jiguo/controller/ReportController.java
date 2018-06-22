package edu.just.jiguo.controller;

import edu.just.jiguo.model.Report;
import edu.just.jiguo.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @RequestMapping("/getall")
    public List<Report> getReport(Integer reportId){
        List<Report> reports;

        if (reportId == null){
            reports = reportService.getAllReport();
        } else {
            reports = reportService.getAllReportById(reportId);
        }

        return reports;
    }

}
