package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public abstract class BaseGameManager implements GameService{

	@Override
	public void buy(User user, Game game,Campaign campaign) {
		
		System.out.println(user.getFirstName() + " adlý kullanýcý " + game.getName() + " adlý oyunu satýn aldý.");
		
	}

	@Override
	public void add(Game game) {
		
		System.out.println(game.getName() + " adlý oyun eklendi");
		
	}

}
