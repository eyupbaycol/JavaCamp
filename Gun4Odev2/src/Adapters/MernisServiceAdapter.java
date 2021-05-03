package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        //intellij idea için web service client de sorun yaşandı
        return false;
    }
}
