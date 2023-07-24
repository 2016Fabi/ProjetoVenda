package br.com.Vendas.test;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.Vendas.dao.ItensDAO;
import br.com.Vendas.dao.ProdutosDAO;
import br.com.Vendas.dao.VendasDAO;
import br.com.Vendas.domain.Item;
import br.com.Vendas.domain.Produto;
import br.com.Vendas.domain.Vendas;

public class ItemDAOTest {

	@Test
	@Ignore
	public void salvar() {

		ProdutosDAO dao = new ProdutosDAO();
		Produto produto = dao.buscarPorCodigo(1L);

		VendasDAO vendasdao = new VendasDAO();
		Vendas venda = vendasdao.buscarPorCodigo(2L);

		Item ite1 = new Item();

		ite1.setQuantidade(6);
		ite1.setValor_parcial(new BigDecimal(115.99D));
		ite1.setProduto(produto);
		ite1.setVenda(venda);

		ItensDAO itensdao = new ItensDAO();

		itensdao.salvar(ite1);

	}

	@Test
	@Ignore
	public void listar() {
		ItensDAO dao = new ItensDAO();
		List<Item> item = dao.listar();

		System.out.println(item);
	}

	@Test
	@Ignore
	public void buscarPorCodigo() {
		ItensDAO dao = new ItensDAO();
		Item ite1 = dao.buscarPorCodigo(2L);

		System.out.println(ite1);

	}

	@Test
	@Ignore
	public void excluir() {
		ItensDAO dao = new ItensDAO();

		Item item = dao.buscarPorCodigo(3L);

		dao.excluir(item);

	}

	@Test
	@Ignore
	public void editar() {

		ProdutosDAO dao = new ProdutosDAO();
		Produto produto = dao.buscarPorCodigo(2L);

		VendasDAO vendasdao = new VendasDAO();
		Vendas venda = vendasdao.buscarPorCodigo(1L);

		ItensDAO itemdao = new ItensDAO();

		Item item = itemdao.buscarPorCodigo(1L);
		item.setQuantidade(2);
		item.setValor_parcial(new BigDecimal(109.99D));
		item.setProduto(produto);
		item.setVenda(venda);

		itemdao.editar(item);

	}

}
