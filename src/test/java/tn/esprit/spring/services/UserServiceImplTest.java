package tn.esprit.spring.services;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IUserService;

@SpringBootTest

public class UserServiceImplTest {
	@Autowired
	IUserService us;

	
	@Test
	@Order(1)
	public void testReieveAllUsers() {
		List<User>  ListUsers =  us.retrieveAllUsers();
		Assertions.assertEquals(0, ListUsers.size());
	}
	/*
	@Test
	public void testAddUser() {
		}
	
	@Test
	public void testUpdateUser() {
		}
	
	
	@Test
	public void testDeleteUser() {
		}
	*/

}

