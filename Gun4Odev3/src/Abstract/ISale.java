package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface ISale {
    void sale(Customer customer, Game game);
    void campaignSale(Customer customer, Game game, Campaign[] campaigns);
}
