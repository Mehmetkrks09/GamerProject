package UI;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.GamerValidatorManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
	GamerManager gamerManager = new GamerManager(new GamerValidatorManager());
	GameManager gameManager = new GameManager();
	CampaignManager campaignManager=new CampaignManager();
	
	Gamer gamer1=new Gamer(1, "Mehmet", "Karakaþ", "30.11.2001", "123456789");
	Game game1=new Game(1,"Gta vice city",100.0);
	Campaign  campaign = new Campaign(1, "Vice City", 100.0,15.0);
	
	gamerManager.add(gamer1);
	gameManager.add(game1);
	campaignManager.add(campaign);
	
	gameManager.sale(gamer1, game1);
	gameManager.sale(gamer1, game1, campaign);
		
		
	
	
	}
}
