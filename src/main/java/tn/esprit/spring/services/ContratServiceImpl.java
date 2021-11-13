package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.repository.ContratRepository;

@Service
public class ContratServiceImpl implements IContratService {

	@Autowired
	ContratRepository contratRepository;
	private static final Logger l = LogManager.getLogger(ContratServiceImpl.class);
// git test
//second git 	
	@Override
	public List<Contrat> retrieveAllContrats() { 
		List<Contrat> contrats = null; 
		try {
	
			l.info("In method retrieveAllContrats :"); 
			contrats = (List<Contrat>) contratRepository.findAll();  
			l.debug("connexion à la DB Ok:");
			//int i =1/0;
			for (Contrat contrat : contrats) {
				l.debug("Contrat : "+ contrat.getSalaire());

			} 
			l.info("Out of method retrieveAllContrats with success");
		}catch (Exception e) {
			l.error("Out of method retrieveAllContrats with Error :"+ e);
		}

		return contrats;
	}

	@Override
	public Contrat addContrat(Contrat u) {
		l.info("In method addContrat");
		Contrat u_saved = contratRepository.save(u); 
		l.info("out of method addContrat");
		return u_saved; 
	}

	@Override 
	public Contrat updateContrat(Contrat u) { 
		l.info("In method updateContrat");
		Contrat u_saved = contratRepository.save(u); 
		l.info("out of method updateContrat");
		return u_saved; 
	}

	@Override
	public void deleteContrat(String id) {
		l.info("In method deleteContrat");
		contratRepository.deleteById(Long.parseLong(id)); 
		l.info("out of  method deleteContrat");
	}

	@Override
	public Contrat retrieveContrat(String id) {
		Contrat cont = null ;
		try{
			l.info("in  method retrieveContrat");
			Contrat u =  contratRepository.findById(Long.parseLong(id)).get(); 
			l.info("out of  method retrieveContrat");
		}
		catch(Exception e){
			l.error("error in retrieveContrat"+ e);
		}
		return cont; 
	}



}
