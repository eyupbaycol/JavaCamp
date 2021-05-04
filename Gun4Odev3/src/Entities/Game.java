package Entities;

public class Game {
    private int id;
    private String gameName;
    private String gameCategory;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
