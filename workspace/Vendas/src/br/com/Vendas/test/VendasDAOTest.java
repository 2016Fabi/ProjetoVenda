package br.com.Vendas.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.Vendas.dao.FuncionariosDAO;
import br.com.Vendas.dao.VendasDAO;
import br.com.Vendas.domain.Funcionario;
import br.com.Vendas.domain.Vendas;

public class VendasDAOTest {
	
	@Test
    @Ignore
	public void salvar() {
		
        FuncionariosDAO dao = new FuncionariosDAO();

		Funcionario funcionario = dao.buscarPorCodigo(5L);
		
		Vendas v1 = new Vendas();
		
		v1.setHorario(new Date());
	    v1.setValor_total(new BigDecimal(20.00D));
		v1.setFuncionario(funcionario);
		
		VendasDAO vendasdao = new VendasDAO();
		
		vendasdao.salvar(v1);
		
	}
	
	@Test
    @Ignore
	public void listar() {
		VendasDAO dao = new VendasDAO();
		List<Vendas> venda = dao.listar();
		
		System.out.println(venda);   
	}
	
	@Test
	@Ignore
	public void buscarPorCodigo() {
		VendasDAO dao = new VendasDAO();
	    Vendas v1 = dao.buscarPorCodigo(2L);
	    
			System.out.println(v1);
		
	}
	
	@Test
	@Ignore
	public void excluir() {
		VendasDAO dao = new VendasDAO();

		Vendas venda = dao.buscarPorCodigo(3L);

		
			dao.excluir(venda);
		

	}
	
	@Test
	@Ignore
	public void editar() {
		
		FuncionariosDAO dao = new FuncionariosDAO();

		Funcionario funcionario = dao.buscarPorCodigo(3L);
		        
        VendasDAO vendasdao = new VendasDAO();
        Vendas v1 = vendasdao.buscarPorCodigo(1L);
        
		v1.setHorario(new Date());
	    v1.setValor_total(new BigDecimal(20.00D));
		v1.setFuncionario(funcionario);
		
		
		
		vendasdao.editar(v1);
			
	}
}
