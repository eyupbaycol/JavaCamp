package business.concretes;

import business.abstracts.AuthService;
import core.abstracts.EmailService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class AuthManager implements AuthService {
    private EmailService emailService;
    private UserDao userDao;

    public AuthManager(EmailService emailService, UserDao userDao) {
        this.emailService = emailService;
        this.userDao = userDao;
    }

    @Override
    public void login(User user) {
        if(user.geteMail().isEmpty() || user.getPassword().isEmpty()){
            System.out.println("Email ve password alanları boş bırakılamaz");
            return;
        }else if(!this.emailService.isValidEmail(user.geteMail())) {
            System.out.println("Lütfen geçerli bir email adresi giriniz");
            return;
        }
        String message = this.userDao.login(user);
        System.out.println(message);
    }

    @Override
    public void logOut(User user) {
        String message = this.userDao.logOut(user);
        System.out.println(message);
    }
}
