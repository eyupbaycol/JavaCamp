package Abstract;

import Entities.Campaign;

public interface ICampaign {
    void addCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);
    void deleteCampaign(Campaign campaign);
}
