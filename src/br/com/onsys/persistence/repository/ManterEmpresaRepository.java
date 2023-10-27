package br.com.onsys.persistence.repository;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import br.com.bb.amb.jpa.persistenciadao.BBTSGenericDAO;
import br.com.onsys.constants.ManterEmpresaConstant;
import br.com.onsys.util.ManterEmpresaClassUtil;

@Transactional(value = ManterEmpresaConstant.TRANSACTION_MANAGER_MANTER_EMPRESA)
public class ManterEmpresaRepository <T extends Serializable> extends BBTSGenericDAO <T> implements Serializable  {

private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = ManterEmpresaConstant.PERSISTENCE_UNIT_MANTER_EMPRESA)
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() throws ClassNotFoundException, Exception{
		super.setEntityManager(this.entityManager);
		super.setClazzForName ((Class<T>) Class.forName(ManterEmpresaClassUtil.
				getCanonicalNamePorTipoGenericsSadc(this.getClass(),ManterEmpresaConstant.PACKAGE_SCAN_MODEL_EMPRESA)));

	}
	
}
