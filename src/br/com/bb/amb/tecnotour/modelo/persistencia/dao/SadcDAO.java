package br.com.bb.amb.tecnotour.modelo.persistencia.dao;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import br.com.bb.amb.jpa.persistenciadao.BBTSGenericDAO;
import br.com.bb.amb.sadc.util.BBTSClassUtil;

@Transactional(value = "transactionManagerSadc")
public class SadcDAO <T extends Serializable> extends BBTSGenericDAO <T> implements Serializable  {

private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "sadc")
	private EntityManager entityManager;
	
	@PostConstruct
	public void init() throws ClassNotFoundException, Exception{
		super.setEntityManager(this.entityManager);
		super.setClazzForName ((Class<T>) Class.forName(BBTSClassUtil.getCanonicalNamePorTipoGenericsSadc(this.getClass(),"br.com.bb.amb.sadc.modelo.entidade")));

	}
	
	@javax.transaction.Transactional
	public T alterar(T entidade) throws Exception {
		return super.alterar(entidade);
	}
	
}
