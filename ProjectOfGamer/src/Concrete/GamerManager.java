package Concrete;

import Abstract.GamerService;
import Abstract.GamerValidatorService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	GamerValidatorService gamerValidator;
	public GamerManager(GamerValidatorService gamerValidator) {
		super();
		this.gamerValidator = gamerValidator;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerValidator.validate(gamer))
		{
		System.out.println(gamer.getFirstName() +" Sisteme Eklendi" );
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerValidator.validate(gamer))
		{
		System.out.println(gamer.getFirstName() +" Sistemde Güncellendi" );
		}
	}

	@Override
	public void delete(Gamer gamer) {
		if(gamerValidator.validate(gamer))
		{
		System.out.println(gamer.getFirstName() +" Sistemden Silindi" );
		}
	}

}
