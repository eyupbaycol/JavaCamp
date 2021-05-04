package Adapters;

import Abstract.ICampaignCheckService;
import Entities.Campaign;
import Entities.Game;

import java.util.ArrayList;
import java.util.List;

public class CampaignAdapter implements ICampaignCheckService {
    @Override
    public List<Campaign> checkCampaign(Game game, Campaign[] campaigns) {
        List<Campaign> returnCampaign = new ArrayList<Campaign>();
        for(int i = 0 ; i < campaigns.length; i++) {
            if(game.getGameCategory() == campaigns[i].getGameCategory()){
                returnCampaign.add(campaigns[i]);
            }
        }
        return returnCampaign;
    }
}
