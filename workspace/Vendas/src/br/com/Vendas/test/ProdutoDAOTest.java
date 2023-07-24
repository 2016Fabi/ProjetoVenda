package br.com.Vendas.test;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.Vendas.dao.FornecedoresDAO;
import br.com.Vendas.dao.ProdutosDAO;
import br.com.Vendas.domain.Fornecedor;
import br.com.Vendas.domain.Produto;

public class ProdutoDAOTest {
	
	@Test
    @Ignore
	public void salvar() {
		
        FornecedoresDAO dao = new FornecedoresDAO();

		Fornecedor fornecedor = dao.buscarPorCodigo(3L);
		
		Produto p1 = new Produto();
		
		p1.setDescricao("Feijao");
	    p1.setPreco(new BigDecimal(13.99D));
		p1.setQuantidade(5);
		p1.setFornecedor(fornecedor);
		
		ProdutosDAO produtosdao = new ProdutosDAO();
		
		produtosdao.salvar(p1);
		
	}
	
	@Test
    @Ignore
	public void listar() {
		ProdutosDAO dao = new ProdutosDAO();
		List<Produto> produtos = dao.listar();
		
		System.out.println(produtos);   
	}
	
	@Test
	@Ignore
	public void buscarPorCodigo() {
		ProdutosDAO dao = new ProdutosDAO();
	    Produto p1 = dao.buscarPorCodigo(2L);
	    
			System.out.println(p1);
		
	}
	
	@Test
	@Ignore
	public void excluir() {
		ProdutosDAO dao = new ProdutosDAO();

		Produto produto = dao.buscarPorCodigo(3L);

		
			dao.excluir(produto);
		

	}
	
	@Test
	@Ignore
	public void editar() {
		
		FornecedoresDAO dao = new FornecedoresDAO();

		Fornecedor fornecedor = dao.buscarPorCodigo(3L);
		
		ProdutosDAO produtodao = new ProdutosDAO();

		Produto produto = produtodao.buscarPorCodigo(1L);
		produto.setDescricao("Patata");
		produto.setPreco(new BigDecimal(10.99D));
		produto.setQuantidade(2);
		produto.setFornecedor(fornecedor);
		
			produtodao.editar(produto);
			
	}
}
