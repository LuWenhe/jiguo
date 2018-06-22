package edu.just.jiguo.controller;

import edu.just.jiguo.model.BestPlay;
import edu.just.jiguo.model.HotTiYan;
import edu.just.jiguo.service.BestPlayService;
import edu.just.jiguo.service.HotTiYanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/hotTiYan")
public class HotTiYanController {

    @Autowired
    private HotTiYanService hotTiYanService;

    @RequestMapping("/getAll")
    public List<HotTiYan> getAll(){
        return hotTiYanService.getAllHotTiYans();
    }

    @RequestMapping("/addHotTiYan")
    public String addHotTiYan(HotTiYan hotTiYan){
        boolean flag = hotTiYanService.addHotTiYan(hotTiYan);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

    @RequestMapping("/getById")
    public HotTiYan getById(Integer hotTiYanId){
        return hotTiYanService.getHotTiYanById(hotTiYanId);
    }

    @RequestMapping("/delete")
    public String deleteHotTiYan(Integer hotTiYanId){
        boolean flag = hotTiYanService.deleteHotTiYan(hotTiYanId);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

    @RequestMapping("/update")
    public String updateBestGuid(HotTiYan hotTiYan){
        boolean flag = hotTiYanService.updateHotTiYan(hotTiYan);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

}
