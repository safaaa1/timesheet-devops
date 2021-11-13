package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRepository;
	private static final Logger l = LogManager.getLogger(UserServiceImpl.class);
// git test
//second git 	
	@Override
	public List<User> retrieveAllUsers() { 
		List<User> users = null; 
		try {
	
			l.info("In method retrieveAllUsers :"); 
			users = (List<User>) userRepository.findAll();  
			l.debug("connexion à la DB Ok:");
			//int i =1/0;
			for (User user : users) {
				l.debug("user :" +user.getLastName());
			} 
			l.info("Out of method retrieveAllUsers with success");
		}catch (Exception e) {
			l.error("Out of method retrieveAllUsers with Error :"+ e);
		}

		return users;
	}

	@Override
	public User addUser(User u) {
		l.info("in method addUser");
		User u_saved = userRepository.save(u); 
		l.info("out of  method addUser");
		return u_saved; 
	}

	@Override 
	public User updateUser(User u) { 
		l.info("in method updateUser");
		User u_saved = userRepository.save(u); 
		l.info("out of method updateUser");
		return u_saved; 
	}

	@Override
	public void deleteUser(String id) {
		l.info("in method deleteUser");
		userRepository.deleteById(Long.parseLong(id)); 
		l.info("out of method deleteUser");
	}

	@Override
	public User retrieveUser(String id) {
		User u = null;
		try {
			l.info("in method retrieveUser");
			 u =  userRepository.findById(Long.parseLong(id)).get(); 
			l.info("out of method retrieveUser");	
		}
		catch(Exception e ){
			l.error("error in method retrieveUser " +e);
		}
		return u; 
	}

}
