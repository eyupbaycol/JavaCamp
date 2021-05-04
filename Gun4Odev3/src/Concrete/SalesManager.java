package Concrete;

import Abstract.ISale;
import Adapters.CampaignAdapter;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

import java.util.List;

public class SalesManager implements ISale {
    private CampaignAdapter campaignAdapter;

    public SalesManager(CampaignAdapter campaignAdapter) {
        this.campaignAdapter = campaignAdapter;
    }

    @Override
    public void sale(Customer customer, Game game) {
        System.out.println(customer.getFirstName() +" adlı kullanıcı "+game.getGameName() +" oyununu başarıyla satın aldı");
    }

    @Override
    public void campaignSale(Customer customer, Game game, Campaign[] campaigns) {
        List<Campaign> returnedCampaign = this.campaignAdapter.checkCampaign(game, campaigns);
        sale(customer,game);
        if(!returnedCampaign.isEmpty()){
            System.out.println("Bu oyun türü için geçerli kampanyalar : ");
            for(Campaign campaign : returnedCampaign) {
                System.out.println(campaign.getCampaignName());
            }
        }
    }
}
