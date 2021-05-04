package Abstract;

import Entities.Campaign;
import Entities.Game;

import java.util.List;

public interface ICampaignCheckService {
    List<Campaign> checkCampaign(Game game, Campaign[] campaign);
}
