package edu.just.jiguo.controller;

import edu.just.jiguo.model.BestReport;
import edu.just.jiguo.service.BestReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bestReport")
public class BestReportController {

    @Autowired
    private BestReportService bestReportService;

    @RequestMapping("/getAll")
    public List<BestReport> getAll(){
        return bestReportService.getAllBestReports();
    }

    @RequestMapping("/addBestGuid")
    public String addBestGuid(BestReport bestReport){
        boolean flag = bestReportService.addBestReport(bestReport);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

    @RequestMapping("/getById")
    public BestReport getById(Integer bestReportId){
        return bestReportService.getBestReportById(bestReportId);
    }

    @RequestMapping("/delete")
    public String deleteBestGuid(Integer bestReportId){
        boolean flag = bestReportService.deleteBestReport(bestReportId);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

    @RequestMapping("/update")
    public String updateBestGuid(BestReport bestReport){
        boolean flag = bestReportService.updateBestReport(bestReport);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }
}
