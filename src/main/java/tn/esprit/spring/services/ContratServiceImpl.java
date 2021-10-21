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
				// TODO Log à ajouter pour affiher chaque user dans les logs   
			} 
			l.info("Out of method retrieveAllContrats with success");
		}catch (Exception e) {
			l.error("Out of method retrieveAllContrats with Error :"+ e);
		}

		return contrats;
	}

	@Override
	public Contrat addContrat(Contrat u) {
		// TODO Log à ajouter en début de la méthode 
		Contrat u_saved = contratRepository.save(u); 
		// TODO Log à ajouter à la fin de la méthode 
		return u_saved; 
	}

	@Override 
	public Contrat updateContrat(Contrat u) { 
		// TODO Log à ajouter en début de la méthode 
		Contrat u_saved = contratRepository.save(u); 
		// TODO Log à ajouter à la fin de la méthode 
		return u_saved; 
	}

	@Override
	public void deleteContrat(String id) {
		// TODO Log à ajouter en début de la méthode 
		contratRepository.deleteById(Long.parseLong(id)); 
		// TODO Log à ajouter à la fin de la méthode 
	}

	@Override
	public Contrat retrieveContrat(String id) {
		// TODO Log à ajouter en début de la méthode 
		//User u =  userRepository.findById(Long.parseLong(id)).orElse(null);
		Contrat u =  contratRepository.findById(Long.parseLong(id)).get(); 
		// TODO Log à ajouter à la fin de la méthode 
		return u; 
	}



}
