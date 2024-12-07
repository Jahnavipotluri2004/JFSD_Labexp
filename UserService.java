package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.User;
import java.util.List;

public interface UserService {
    public String addUser(User user);
    public String updateUser(User user);
    public String deleteUser(int uid);
    public List<User> displayAllUsers();
    public User displayById(int uid);
}
