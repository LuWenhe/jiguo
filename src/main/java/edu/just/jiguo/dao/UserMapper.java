package edu.just.jiguo.dao;

import edu.just.jiguo.model.User;
import edu.just.jiguo.util.MyMapper;

public interface UserMapper extends MyMapper<User> {

    public User getUserByNameAndPassword(User user);

    public User getUserByName(String username);

    public void addUser(User user);

}