package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void add(Game entity) {
	System.out.println(entity.getName()+ " Oyunu Sisteme Eklendi ");
		
	}

	@Override
	public void update(Game entity) {
		System.out.println(entity.getName()+ " Oyunu G�ncellendi ");
		
	}

	@Override
	public void delete(Game entity) {
		
		System.out.println(entity.getName()+ " Oyunu Sistemden silindi ");
	}

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName()+" "+ game.getName()+" �simli Oyunu Sat�n Ald�");
		
	}

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
System.out.println(gamer.getFirstName()+" "+game.getName() +" �simli Oyunu "+game.getPrice() +" yerine "+campaign.getDiscount()+" a Ald�");
		
	}

}
