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

	
	@Override
	public List<User> retrieveAllUsers() { 
		List<User> users = null; 
		try {
	
			l.info("In method retrieveAllUsers :"); 
			users = (List<User>) userRepository.findAll();  
			l.debug("connexion à la DB Ok:");
			//int i =1/0;
			for (User user : users) {
				// TODO Log à ajouter pour affiher chaque user dans les logs   
			} 
			l.info("Out of method retrieveAllUsers with success");
		}catch (Exception e) {
			l.error("Out of method retrieveAllUsers with Error :"+ e);
		}

		return users;
	}

	@Override
	public User addUser(User u) {
		// TODO Log à ajouter en début de la méthode 
		User u_saved = userRepository.save(u); 
		// TODO Log à ajouter à la fin de la méthode 
		return u_saved; 
	}

	@Override 
	public User updateUser(User u) { 
		// TODO Log à ajouter en début de la méthode 
		User u_saved = userRepository.save(u); 
		// TODO Log à ajouter à la fin de la méthode 
		return u_saved; 
	}

	@Override
	public void deleteUser(String id) {
		// TODO Log à ajouter en début de la méthode 
		userRepository.deleteById(Long.parseLong(id)); 
		// TODO Log à ajouter à la fin de la méthode 
	}

	@Override
	public User retrieveUser(String id) {
		// TODO Log à ajouter en début de la méthode 
		//User u =  userRepository.findById(Long.parseLong(id)).orElse(null);
		User u =  userRepository.findById(Long.parseLong(id)).get(); 
		// TODO Log à ajouter à la fin de la méthode 
		return u; 
	}

}
