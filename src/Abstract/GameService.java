package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface GameService {

	void buy(User user,Game game,Campaign campaign);
	void add(Game game);
	
}
