import business.abstracts.BaseUserManager;
import business.concretes.AuthManager;
import business.concretes.UserManager;
import core.abstracts.EmailService;
import core.concretes.BaseEmailManager;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        User user = new User(1,"Eyüp", "Bayçöl", "eyu.bycl@gmail.com","******");
        UserDao userDao = new HibernateUserDao();
        EmailService emailService = new BaseEmailManager();
        BaseUserManager baseUserManager = new UserManager(userDao,emailService);
        baseUserManager.addNewUser(user);
        System.out.println("---------------------");
        AuthManager loginManager = new AuthManager(emailService,userDao);
        loginManager.login(user);
        System.out.println("-------------------------");
        loginManager.logOut(user);
    }
}
