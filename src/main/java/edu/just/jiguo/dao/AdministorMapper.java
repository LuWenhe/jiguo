package edu.just.jiguo.dao;

import edu.just.jiguo.model.Administor;
import edu.just.jiguo.model.User;
import edu.just.jiguo.util.MyMapper;

public interface AdministorMapper extends MyMapper<Administor> {

    public Administor getUserByNameAndPassword(Administor administor);

    public Administor getUserByName(String username);

}