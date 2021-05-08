package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public abstract class BaseGameManager implements GameService{

	@Override
	public void buy(User user, Game game,Campaign campaign) {
		
		System.out.println(user.getFirstName() + " adl� kullan�c� " + game.getName() + " adl� oyunu sat�n ald�.");
		
	}

	@Override
	public void add(Game game) {
		
		System.out.println(game.getName() + " adl� oyun eklendi");
		
	}

}
