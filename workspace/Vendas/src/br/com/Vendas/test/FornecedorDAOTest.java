package br.com.Vendas.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.Vendas.dao.FornecedoresDAO;
import br.com.Vendas.domain.Fornecedor;

public class FornecedorDAOTest {
	
	@Test
	@Ignore
	public void salvar() {
		Fornecedor f1 = new Fornecedor();
		f1.setDescricao("rogerio");
		Fornecedor f2 = new Fornecedor();
		f2.setDescricao("fabi");
		
		
		FornecedoresDAO dao = new FornecedoresDAO();
		
		dao.salvar(f1);
		dao.salvar(f2);
	}
	
	@Test
	@Ignore
	public void listar() {
		FornecedoresDAO dao = new FornecedoresDAO();
		List<Fornecedor> fornecedores = dao.listar();
		
		for(Fornecedor fornecedor : fornecedores) {
			System.out.println(fornecedor);
		}
		
	}
	
	@Test
	@Ignore
	public void buscarPorCodigo() {
		FornecedoresDAO dao = new FornecedoresDAO();
	    Fornecedor f1 = dao.buscarPorCodigo(1L);
	    Fornecedor f2 = dao.buscarPorCodigo(3L);
	    
			System.out.println(f1);
			System.out.println(f2);
		
	}
	
	@Test
	@Ignore
	public void excluir() {
		FornecedoresDAO dao = new FornecedoresDAO();

		Fornecedor fornecedor = dao.buscarPorCodigo(1L);

		
			dao.excluir(fornecedor);
		

	}
	
	@Test
	@Ignore
	public void editar() {
		
		FornecedoresDAO dao = new FornecedoresDAO();

		Fornecedor fornecedor = dao.buscarPorCodigo(3L);
		fornecedor.setDescricao("Max");
		
			dao.editar(fornecedor);
			
	}

}
