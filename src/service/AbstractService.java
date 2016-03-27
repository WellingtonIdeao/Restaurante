package service;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AbstractService {
	public EntityManagerFactory fac = Persistence.createEntityManagerFactory("Restaurante");
		
}	
