package tn.esprit.spring.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

	/*
	@Test
	@Order(1)
	public void testReieveAllContrats() {
		List<Contrat>  ListContrats =  us.retrieveAllContrats();
		Assertions.assertEquals(0, ListContrats.size());
	}*/
	/*
	@Test
	public void testAddContrat() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date d=format.parse("2021-19-21");
		Contrat u = new Contrat(d,"ena",28882607,500);
		Contrat userAdded = us.addContrat(u);
		Assertions.assertEquals(u.getSalaire(),userAdded.getSalaire());
		}
	*/
	/*
	@Test
	public void testUpdateContrat() throws ParseException {
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date d=format.parse("2020-11-21");
		Contrat u = new Contrat(1,d,"safaaaaaaaa",28644531,500);
		Contrat userAdded = us.updateContrat(u);
		Assertions.assertEquals(u.getSalaire(),userAdded.getSalaire());
		}
	
	*/
	@Test
	public void testDeleteContrat() {
		us.deleteContrat("1");
		Assertions.assertNull(us.retrieveContrat("1"));
		}
	

}

