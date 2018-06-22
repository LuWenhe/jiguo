package edu.just.jiguo.controller;

import edu.just.jiguo.model.Administor;
import edu.just.jiguo.service.AdministorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdministorController {

    @Autowired
    private AdministorService administorService;

    @RequestMapping("/login")
    public Administor login(Administor administor){
        return administorService.login(administor);
    }

}
