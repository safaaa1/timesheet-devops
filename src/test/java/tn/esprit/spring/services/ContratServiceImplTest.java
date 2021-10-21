package tn.esprit.spring.services;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IUserService;

@SpringBootTest

public class ContratServiceImplTest {
	@Autowired
	IContratService us;

	
	@Test
	@Order(1)
	public void testReieveAllContrats() {
		List<Contrat>  ListContrats =  us.retrieveAllContrats();
		Assertions.assertEquals(0, ListContrats.size());
	}
	/*
	@Test
	public void testAddContrat() {
		}
	
	@Test
	public void testUpdateContrat() {
		}
	
	
	@Test
	public void testDeleteContrat() {
		}
	*/

}

