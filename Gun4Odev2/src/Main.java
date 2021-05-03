import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbuksCustomerManager;
import Entities.Customer;

import java.sql.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
        Customer customer = new Customer();
        customer.setFirstName("Eyüp");
        customer.setLastName("Bayçöl");
        customer.setNationalityId("36799335016");
        customer.setDateOfBirth(Date.valueOf("2018-01-23"));
        customer.setId(1);
        customerManager.save(customer);
    }
}
