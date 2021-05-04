package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public abstract  class BaseCustomerManager implements ICustomer {
    @Override
    public void addUser(Customer customer) {
        System.out.println(customer.getFirstName() + " başarıyla kaydedildi");
    }

    @Override
    public void updateUser(Customer customer) {
        System.out.println(customer.getFirstName() + " bilgileri başarıyla güncellendi");
    }

    @Override
    public void deleteUser(Customer customer) {
        System.out.println(customer.getFirstName() + " adlı kullanıcı silindi");
    }

}
