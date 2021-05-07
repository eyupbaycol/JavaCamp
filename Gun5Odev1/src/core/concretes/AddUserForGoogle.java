package core.concretes;

import GoogleAuth.GoogleManager;
import core.abstracts.AddUserService;
import core.abstracts.EmailService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class AddUserForGoogle implements AddUserService {
    private UserDao userDao;
    private EmailService emailService;
    public AddUserForGoogle(UserDao userDao, EmailService emailService) {
        this.userDao = userDao;
        this.emailService = emailService;
    }

    @Override
    public void addNewUser(User user) {
        GoogleManager googleManager = new GoogleManager();
        if(this.userDao.getUser(user.geteMail())){
            System.out.println(user.geteMail() + " google emaili ile daha önce kayıt olunmuştur");
            return;
        }
        System.out.println("Google ile  kayıt için bilgiler doğrulandı.");
        this.emailService.sendLinkForMail(user.geteMail());
        System.out.println("-------------------------------");
        this.emailService.activateLinkForMail(user.geteMail());
        this.userDao.addNewUser(user); // veritabanınada kaydetmemiz gerekiyor
        googleManager.addGoogleUser(user);
    }
}
