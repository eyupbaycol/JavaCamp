package business.concretes;


import business.abstracts.BaseUserManager;
import core.abstracts.EmailService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager extends BaseUserManager {
    private UserDao userDao;
    private EmailService emailService;

    public UserManager(UserDao userDao, EmailService emailService) {
        this.userDao = userDao;
        this.emailService = emailService;
    }

    @Override
    public void addNewUser(User user) {
        //Bu kısımda normal giriş olduğu için bilgilerin doğruluğunu kontrol etmek zorundayız
        if (user.getFirstName().isEmpty() || user.getLastName().isEmpty() || user.getPassword().isEmpty()) {
            System.out.println("Lüften sizden istenilen bilgileri eksiksiz bir şekilde doldurun");
            return;
        } else if (user.getPassword().length() < 6) {
            System.out.println("Girilen şifre en az 6 karakter olmalıdır");
            return;
        } else if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
            System.out.println("Ad ve soyad bilgileri en az 2 karakter uzunluğunda olmalıdır");
            return;
        } else if (!this.emailService.isValidEmail(user.geteMail())) {
            System.out.println("Lüften geçerli bir email girin");
            return;
        } else if (this.userDao.getUser(user.geteMail())) {
            System.out.println(user.geteMail() + " Bu mail ile zaten bir kayıt mevcuttur");
            return;
        }
        System.out.println("Normal giriş için bilgiler doğrulandı.");
        this.emailService.sendLinkForMail(user.geteMail());
        System.out.println("-------------------------------");
        this.emailService.activateLinkForMail(user.geteMail());
        this.userDao.addNewUser(user);
    }
}
