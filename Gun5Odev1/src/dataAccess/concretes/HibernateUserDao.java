package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void addNewUser(User user) {
        System.out.println(user.getFirstName() + " adlı Kullanıcı sisteme başarı ile kaydoldu.");
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
        List<User> returnedUsers = getUserList();
        return returnedUsers.stream().filter(o -> o.geteMail().equals(email)).findFirst().isPresent();
    }

    @Override
    public List<User> getUserList() {
        //Şuan elimizde datebase yok ama o yüzden buraya bir liste oluşturup o liste üzeriden kontrol edicem
        List<User> userList = new ArrayList<User>();

        userList.add(new User(4, "Eyüp", "Bayçöl", "eyup.bycl@gmail.com", "********"));
        userList.add(new User(5, "Ahmet", "Taş", "ahmet.tas@hotmail.com", "*******"));
        return userList;
    }
}
