package peaksoft.service;

import peaksoft.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {



    void userAdd(User user);

    User findId(int id);


    void deleteId(int id);


    List<User> getAllUsers();
}

