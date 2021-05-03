package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign entity) {
		System.out.println(entity.getName()+ " Kampanya Sisteme Eklendi ");
	}

	@Override
	public void update(Campaign entity) { 
		System.out.println(entity.getName()+ " Kampanya G�ncellendi ");
		
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println(entity.getName()+ " Kampanya Sisteme Silindi ");
		
	}

}
