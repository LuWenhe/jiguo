package edu.just.jiguo.service;

import edu.just.jiguo.model.Administor;

public interface AdministorService {

    public Administor login(Administor administor);

    public Administor getUserByName(String username);

}
