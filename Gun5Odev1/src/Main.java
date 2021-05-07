import business.concretes.AuthManager;
import business.concretes.UserManager;
import core.abstracts.AddUserService;
import core.abstracts.EmailService;
import core.concretes.AddUserForGoogle;
import core.concretes.BaseEmailManager;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        User user = new User(1,"Eyüp", "Bayçöl", "eyu.bycl@gmail.com","******");
        UserDao userDao = new HibernateUserDao();
        EmailService emailService = new BaseEmailManager();
        UserManager userManager = new UserManager(userDao,emailService);
        AddUserService addUserService = new AddUserForGoogle(userDao,emailService);
        addUserService.addNewUser(user);
        System.out.println("-----------------------------");
        userManager.addNewUser(user);
    }
}
