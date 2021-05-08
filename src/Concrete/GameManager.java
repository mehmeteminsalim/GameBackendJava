package Concrete;

import Abstract.BaseGameManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameManager extends BaseGameManager{

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		super.add(game);
	}

	@Override
	public void buy(User user, Game game,Campaign campaign) {
		
		game.setPrice(game.getPrice()-campaign.getDiscountPrice());
		System.out.println(user.getFirstName() + " adl� kullan�c� " + game.getName() + " adl� oyunu sat�n ald�.  �ndirim : "
		+ campaign.getDiscountPrice() + " sat�� fiyat� : " + game.getPrice());
		super.buy(user, game, campaign);
	}

}
