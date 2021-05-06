package core.concretes;


import core.abstracts.EmailService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaseEmailManager implements EmailService {
    //Email işlemleri her projede olabileceği için  core kısmında yazıyorum
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public boolean isValidEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }
    public void sendLinkForMail(String email) {
        System.out.println(email + " adresine aktivasyon linki gönderilmiştir");
    }
    public void activateLinkForMail(String email) {
        System.out.println(email + " için aktivasyon işlemi tamamlanmıştır.");
    }
}
