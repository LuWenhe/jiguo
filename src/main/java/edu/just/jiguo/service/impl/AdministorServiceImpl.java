package edu.just.jiguo.service.impl;

import edu.just.jiguo.dao.AdministorMapper;
import edu.just.jiguo.model.Administor;
import edu.just.jiguo.service.AdministorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("administorService")
public class AdministorServiceImpl implements AdministorService{

    @Autowired
    private AdministorMapper administorMapper;

    @Override
    public Administor login(Administor administor) {
        return administorMapper.getUserByNameAndPassword(administor);
    }

    @Override
    public Administor getUserByName(String username) {
        return administorMapper.getUserByName(username);
    }

}
