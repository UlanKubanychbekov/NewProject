package peaksoft.dao;


import peaksoft.model.User;
import peaksoft.service.UserService;
import peaksoft.service.impl.UserServiceImpl;

import java.util.List;
import java.util.Objects;

public class UserDao implements UserService{

    UserService dao = new UserServiceImpl();

    @Override
    public void userAdd(User user) {
        User user1 = new User();
        String name = user.getName();

        if(Objects.equals(user1, name)){
            throw  new RuntimeException();
        }
        dao.userAdd(user);
    }

    @Override
    public User findId(int id) {
        return dao.findId(id);
    }

    @Override
    public void deleteId(int id) {
        dao.deleteId(id);
    }

    @Override
    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }
}
