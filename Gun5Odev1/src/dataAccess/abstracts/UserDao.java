package dataAccess.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserDao {
    void addNewUser(User user);
    String login(User user);
    String logOut(User user);
    boolean getUser(String email);
    List<User> getUserList();
}
