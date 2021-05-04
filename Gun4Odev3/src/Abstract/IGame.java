package Abstract;

import Entities.Customer;
import Entities.Game;

public interface IGame {
    void add(Game game);
    void updateGame(Game game);
    void deleteGame(Game game);
}
