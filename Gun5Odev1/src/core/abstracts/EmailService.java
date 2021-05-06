package core.abstracts;

public interface EmailService {
    //interface yapmamın sebebi farklı ileride bekli gmail için ayrı hotmail için ayrı istekleri bulunabilir
    boolean isValidEmail(String email);
    void sendLinkForMail(String email);
    void activateLinkForMail(String email);
}
