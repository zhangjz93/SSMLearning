package cn.zjz.dao;

import cn.zjz.model.User;

import java.util.List;

public interface UserMapper {

    public List<User> getAllUsers();

    public User getUserById(String userId);

    public void insertUser(User user);

    public void deleteUser(String userId);
}
