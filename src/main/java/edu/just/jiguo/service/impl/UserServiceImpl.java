package edu.just.jiguo.service.impl;

import edu.just.jiguo.dao.UserMapper;
import edu.just.jiguo.model.User;
import edu.just.jiguo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        User user1 = userMapper.getUserByNameAndPassword(user);
        return user1;
    }

    @Override
    public User getUserByName(String username) {
        User user = userMapper.getUserByName(username);
        return user;
    }

    @Override
    public boolean addUser(User user) {
        boolean result = false;

        User user1 = getUserByName(user.getUsername());
        if (user1 != null ){
            return result;
        }

        userMapper.addUser(user);
        result = true;
        return result;
    }

}
