package Abstract;

import Entities.Customer;
import Entities.Game;

public abstract class BaseGameManager implements IGame {
    @Override
    public void add(Game game) {
        System.out.println(game.getGameName() + " isminde yeni bir oyun eklendi.");
    }

    @Override
    public void updateGame(Game game) {
        System.out.println(game.getGameName() + " ismindeki oyun güncellendi.");
    }

    @Override
    public void deleteGame(Game game) {
        System.out.println(game.getGameName() + " ismindeki oyun silindi.");
    }
}
