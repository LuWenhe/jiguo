package edu.just.jiguo.controller;

import edu.just.jiguo.model.BestGuid;
import edu.just.jiguo.service.BestGuidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/bestGuid")
public class BestGuidController {

    @Autowired
    private BestGuidService bestGuidService;

    @RequestMapping("/getAll")
    public List<BestGuid> getAll(){
        return bestGuidService.getAllBestGuids();
    }

    @RequestMapping("/add")
    public String addBestGuid(BestGuid bestGuid){
        boolean flag = bestGuidService.addBestGuid(bestGuid);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

    @RequestMapping("/getById")
    public BestGuid getById(Integer bestguidId){
        return bestGuidService.getBestGuidById(bestguidId);
    }

    @RequestMapping("/delete")
    public String deleteBestGuid(Integer bestGuidId){
        boolean flag = bestGuidService.deleteBestGuid(bestGuidId);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

    @RequestMapping("/update")
    public String updateBestGuid(BestGuid bestGuid){
        boolean flag = bestGuidService.updateBestGuid(bestGuid);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

}
