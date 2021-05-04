import Adapters.CampaignAdapter;
import Adapters.eDevletServiceAdapter;
import Concrete.CustomerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer();
	    customer.setFirstName("Eyüp");
        CustomerManager customerManager = new CustomerManager(new eDevletServiceAdapter());
        customerManager.addUser(customer);
        customerManager.updateUser(customer);
        customerManager.deleteUser(customer);
        SalesManager salesManager = new SalesManager(new CampaignAdapter());
        Game game = new Game();
        game.setGameName("GTA");
        game.setGameCategory("Açık dünya");
        game.setPrice(99);
        Campaign campaign = new Campaign();
        campaign.setId(1);
        campaign.setDiscountRate(7);
        campaign.setCampaignName("Açık dünya özel indirim kampanyası");
        campaign.setGameCategory("Deneme");
        Campaign[] campaigns = new Campaign[]{campaign};
        salesManager.campaignSale(customer,game, campaigns);
    }
}
