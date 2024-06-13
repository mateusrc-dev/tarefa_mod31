package br.com.rpires;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.rpires.dao.ICursoDao;
import br.com.rpires.domain.Curso;
import br.com.rpires.dao.CursoDao;

public class CursoTest {
	private ICursoDao CursoDao;
	
	public CursoTest() {
		CursoDao = new CursoDao();
	}
	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("Curso teste");
		curso.setCurso("Curso de Java Back-end");
		
		curso = CursoDao.cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}
}
