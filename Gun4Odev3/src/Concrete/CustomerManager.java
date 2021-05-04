package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICampaignCheckService;
import Abstract.ICustomer;
import Abstract.ICustomerCheckService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class CustomerManager extends BaseCustomerManager {
    private ICustomerCheckService customerCheckService;

    public CustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;

    }

    @Override
    public void addUser(Customer customer) {
        if (this.customerCheckService.CheckIfRealPerson(customer)) {
            super.addUser(customer);
        } else {
            System.out.println("Kullanıcı bilgileri doğrulanamadı");
        }
    }

}
