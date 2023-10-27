package br.com.onsys.persistence.repository;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import br.com.bb.amb.jpa.persistenciadao.BBTSGenericDAO;
import br.com.onsys.util.BBTSClassUtil;

@Transactional(value = "transactionManagerManterEmpresa")
public class ManterEmpresaRepository <T extends Serializable> extends BBTSGenericDAO <T> implements Serializable  {

private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "manterEmpresa")
	private EntityManager entityManager;
	
	@PostConstruct
	public void init() throws ClassNotFoundException, Exception{
		super.setEntityManager(this.entityManager);
		super.setClazzForName ((Class<T>) Class.forName(BBTSClassUtil.getCanonicalNamePorTipoGenericsSadc(this.getClass(),"br.com.onsys.model")));

	}
	@javax.transaction.Transactional
	public T alterar(T entidade) throws Exception {
		return super.alterar(entidade);
	}
	
}
