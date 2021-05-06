package business.concretes;

import business.abstracts.BaseUserManager;
import core.abstracts.EmailService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class GoogleUserManager extends BaseUserManager {
    private UserDao userDao;
    private EmailService emailService;

    public GoogleUserManager(UserDao userDao,EmailService emailService) {
        this.userDao = userDao;
        this.emailService = emailService;
    }

    @Override
    public void addNewUser(User user) {
        //Burada kişi google üzerinden kayıt olacağı için herhangi bir alan kontrolü yapmayacağız
        //sadece daha önce kayıtlımı diye kontrol ettireceğiz

        if (this.userDao.getUser(user.geteMail())) {
            System.out.println(user.geteMail() + " Bu mail ile zaten bir kayıt mevcuttur");
        } else {
            System.out.println("Google ile giriş için bilgiler Doğrulandı.");
            this.emailService.sendLinkForMail(user.geteMail());
            System.out.println("-------------------------------");
            this.emailService.activateLinkForMail(user.geteMail());
            this.userDao.addNewUser(user);
        }
    }
}
