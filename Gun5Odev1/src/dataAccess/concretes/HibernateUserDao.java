package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    public static List<User> userList = new ArrayList<User>();
    @Override
    public void addNewUser(User user) {
        System.out.println(user.getFirstName() + " adlı Kullanıcı sisteme başarı ile kaydoldu.");
        userList.add(user);
    }

    @Override
    public String login(User user) {

        System.out.println(user.getFirstName() + " adlı Kullanıcı başarılı bir şekilde oturum açtı.");
        return "Login işlemi sonucunda token oluşturuldu";
    }

    @Override
    public String logOut(User user) {
        System.out.println(user.getFirstName() + " adlı Kullanıcı başarılı bir şekilde oturumu sonlandırdı.");
        return "Logout işlemi sonucunda token silindi";
    }

    @Override
    public boolean getUser(String email) {
        return userList.stream().filter(o -> o.geteMail().equals(email)).findFirst().isPresent();
    }


}
