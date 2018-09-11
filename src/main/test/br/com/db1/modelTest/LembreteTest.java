package br.com.db1.modelTest;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.model.Lembrete;
import br.com.db1.dao.impl.LembreteDao;

public class LembreteTest extends AbstractTestCase {

	private LembreteDao dao;

	@Before
	public void init() {
		dao = new LembreteDao(manager);
	}

	@Test
	public void inserirTest() {
		Lembrete lembrete = new Lembrete();
		lembrete.setData_lembrete(new Date());
		lembrete.setDescricao("teste de cadastro");
		manager.persist(lembrete);

	}

	@Test
	public void pegarLista() {

		System.out.println(dao.findAll().size());
		Assert.assertTrue(dao.findAll().size()>0);
		
	}

	@Test
	public void pegarid() {

		Lembrete lembrete = dao.findById(1);		
		Assert.assertEquals("teste de inserção" , lembrete.getDescricao());		
	}

}
