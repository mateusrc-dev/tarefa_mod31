package br.com.rpires;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.rpires.dao.IProdutoDao;
import br.com.rpires.dao.ProdutoDao;
import br.com.rpires.domain.Produto;

public class ProdutoTest {
	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}
	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setCodigo("A1");
		produto.setNome("Nescal");
		
		produto = produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}
}
