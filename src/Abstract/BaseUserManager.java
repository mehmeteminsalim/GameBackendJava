package Abstract;

import Entities.User;

public abstract class BaseUserManager implements UserService {

	@Override
	public void save(User user) {
		
		System.out.println("Save user : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		
		System.out.println("Update user : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		
		System.out.println("Delete user : " + user.getFirstName());
		
	}

}
