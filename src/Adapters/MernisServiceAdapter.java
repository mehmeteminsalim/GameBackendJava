package Adapters;

import Abstract.UserCheckService;
import Entities.User;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		// TODO Auto-generated method stub
		System.out.println("Mernis Doðrulandý");
		return true;
	}

}
