package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface ICustomer {
    void addUser(Customer customer);
    void updateUser(Customer customer);
    void deleteUser(Customer customer);
}
