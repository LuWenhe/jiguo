package edu.just.jiguo.controller;

import edu.just.jiguo.model.KuWan;
import edu.just.jiguo.service.KuWanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/kuwan")
public class KuwanController {

    @Autowired
    private KuWanService kuWanService;

    @RequestMapping("/getAll")
    public List<KuWan> getAllKuWans(){
        return kuWanService.getAllKuWans();
    }

    @RequestMapping("/addKuWan")
    public String addHotTiYan(KuWan kuWan){
        boolean flag = kuWanService.addKuWan(kuWan);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

    @RequestMapping("/getById")
    public KuWan getById(Integer kuwanId){
        return kuWanService.getKuWanById(kuwanId);
    }

    @RequestMapping("/delete")
    public String deleteHotTiYan(Integer kuwanId){
        boolean flag = kuWanService.deleteKuWan(kuwanId);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

    @RequestMapping("/update")
    public String updateBestGuid(KuWan kuWan){
        boolean flag = kuWanService.updateKuWan(kuWan);
        if(flag){
            return "1";
        }else{
            return "0";
        }
    }

}
