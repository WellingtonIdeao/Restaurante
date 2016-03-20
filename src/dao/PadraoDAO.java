package dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.EntityGeneric;

public abstract class PadraoDAO<T extends EntityGeneric> {
	protected EntityManager manager;
	
	
	public PadraoDAO(EntityManager manager){
		this.manager = manager;
		
	}
	
	public void inserir(T entity){
		manager.persist(entity);
	}
	public T buscarPorId(Long id) {
		return manager.find(entityClass(), id);
	}
	public List<T> listar(){
		Query consulta = manager.createQuery("select p from "+entityClass().getSimpleName()+" p");
				return consulta.getResultList();
		
	}
	public void atualizar(T entity){ //?????
		entity = manager.merge(entity);
	}
	public boolean remover(T entity){
		entity = manager.find(entityClass(),entity.getId());
		
		if(entity != null){
			manager.remove(entity);
			return true;
		}
		else
			return false;
	
	}
	
	public abstract Class<T> entityClass();
}
