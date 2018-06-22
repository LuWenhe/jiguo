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

    @RequestMapping("/getall")
    public List<KuWan> getKuwan(Integer kuwanId){
        List<KuWan> kuWans;

        if (kuwanId== null){
            kuWans = kuWanService.getAllKuwan();
        } else {
            kuWans = kuWanService.getKuwanById(kuwanId);
        }
        return kuWans;
    }

    @RequestMapping("/delete")
    public String deleteKuwan(Integer kuwan_Id){
        boolean flag = kuWanService.deleteKuwanById(kuwan_Id);
        if (flag){
            return "1";
        }
        return "0";
    }
}
