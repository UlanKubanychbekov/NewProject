package peaksoft.service.impl;

import peaksoft.dao.UserDao;
import peaksoft.model.User;
import peaksoft.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserServiceImpl implements UserService {


    Map<Integer, User> daoim = new HashMap<>();




    @Override
    public void userAdd(User user) {
        daoim.put(user.getId(), user);
    }

    @Override
    public User findId(int id) {
        return daoim.get(id);



    }

    @Override
    public void deleteId(int id) {
        daoim.remove(id);

    }

    @Override
    public List<User> getAllUsers() {
        List <User> daos = daoim.values().stream().toList();
        return daos;

    }}
