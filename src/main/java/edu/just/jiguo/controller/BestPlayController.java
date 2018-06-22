package edu.just.jiguo.controller;

import edu.just.jiguo.model.BestGuid;
import edu.just.jiguo.model.BestPlay;
import edu.just.jiguo.service.BestGuidService;
import edu.just.jiguo.service.BestPlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bestPlay")
public class BestPlayController {

    @Autowired
    private BestPlayService bestPlayService;

    @RequestMapping("/getAll")
    public List<BestPlay> getAll(){
        return bestPlayService.getAllBestPlays();
    }

    @RequestMapping("/addBestGuid")
    public String addBestGuid(BestPlay bestPlay){
        boolean flag = bestPlayService.addBestPlay(bestPlay);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

    @RequestMapping("/getById")
    public BestPlay getById(Integer bestplayId){
        return bestPlayService.getBestPlayById(bestplayId);
    }
}
