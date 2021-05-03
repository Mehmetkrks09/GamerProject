package Concrete;

import Abstract.GamerValidatorService;
import Entities.Gamer;

public class GamerValidatorManager implements GamerValidatorService {

	@Override
	public boolean validate(Gamer gamer) {
		if (gamer.getId() == 1 && gamer.getFirstName() == "Mehmet" && gamer.getLastName() == "Karakaþ"
				&& gamer.getDateOfBirth() == "30.11.2001" && gamer.getNationalIdentity() == "123456789")
		{
		
			System.out.println("Kimlik Doðrulama Baþarýlý ");
			return true;
		}
		
		else{ 
		System.out.println("Kimlik Doðrulama Baþarýsýz");
		return false;
		}
		
		
	}

}
