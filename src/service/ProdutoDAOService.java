package service;

import java.sql.SQLException;

import entity.Produto;
import persistence.ProdutoDAO;

public class ProdutoDAOService {

	private ProdutoDAO dao;
	
	public ProdutoDAOService() {
		dao = new ProdutoDAO();
	}
	
	public boolean salvar(Produto p) {
		try {
			dao.gravar(p);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
