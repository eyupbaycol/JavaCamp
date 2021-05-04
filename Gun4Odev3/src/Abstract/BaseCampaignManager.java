package Abstract;

import Entities.Campaign;

public abstract class BaseCampaignManager implements ICampaign {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyası eklendi");
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyası güncellendi");
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyası silindi");
    }
}
