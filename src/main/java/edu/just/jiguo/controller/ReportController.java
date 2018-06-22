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

    @RequestMapping("/getAll")
    public List<Report> getAllKuWans(){
        return reportService.getAllReports();
    }

    @RequestMapping("/addKuWan")
    public String addHotTiYan(Report report){
        boolean flag = reportService.addReport(report);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

    @RequestMapping("/getById")
    public Report getById(Integer reportId){
        return reportService.getReportById(reportId);
    }

    @RequestMapping("/delete")
    public String deleteHotTiYan(Integer reportId){
        boolean flag = reportService.deleteReport(reportId);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

    @RequestMapping("/update")
    public String updateBestGuid(Report report){
        boolean flag = reportService.updateReport(report);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

}
