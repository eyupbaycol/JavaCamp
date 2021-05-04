package Entities;

public class Campaign {
    private int id;
    private String gameCategory;
    private String campaignName;
    private double discountRate;

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
