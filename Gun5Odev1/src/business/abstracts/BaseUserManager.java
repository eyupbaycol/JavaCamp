package business.abstracts;


import entities.concretes.User;

public abstract class BaseUserManager implements UserService {
    @Override
    public void addNewUser(User user) {
            //ileride bir kaç durumda global bir kayıt ekleme istenirse burası kullanılabilir
    }


}
