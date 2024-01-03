package com.manas.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	public static List<User> users = new ArrayList<>();
	private static int id= 0;
	
	static {
		users.add(new User (++id , "Adam" , LocalDate.now().minusYears(30)));
		users.add(new User (++id , "Eve" , LocalDate.now().minusYears(35)));
		users.add(new User (++id , "jim" , LocalDate.now().minusYears(25)));	
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id) {
		return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
		
	}

	public void deleteById(int id) {
		 users.removeIf(user -> user.getId().equals(id));
		
	}
	
	public User save(User user) {
		user.setId(++id);
		users.add(user);
		return user;
	}
	

}
