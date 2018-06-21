package edu.just.jiguo.service;

import edu.just.jiguo.model.User;

public interface UserService {

    public User login(User user);

    public User getUserByName(String username);

    public boolean addUser(User user);

}
