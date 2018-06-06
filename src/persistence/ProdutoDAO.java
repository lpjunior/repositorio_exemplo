package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Produto;

public class ProdutoDAO extends DAO {

	private Connection conn;

	public ProdutoDAO() {
		try {
			conn = getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Problemas ao abrir a conexão");
		}
	}

	public void gravar(Produto p) throws SQLException {
		PreparedStatement stmt = null;

		try {
			stmt = conn.prepareStatement("insert into produto values (null, ?, ?)");

			stmt.setString(1, p.getNmProduto());
			stmt.setInt(2, p.getQuantidade());

			int flag = stmt.executeUpdate();

			if (flag == 0)
				throw new SQLException("Erro ao inserir no bnaco.");
		} finally {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
		}
	}
}
