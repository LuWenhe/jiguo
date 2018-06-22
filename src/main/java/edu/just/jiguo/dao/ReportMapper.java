package edu.just.jiguo.dao;

import edu.just.jiguo.model.Report;
import edu.just.jiguo.util.MyMapper;

import java.util.List;

public interface ReportMapper extends MyMapper<Report> {

    public List<Report> getAllReport();

    public List<Report> getAllReportById(Integer report_id);

}