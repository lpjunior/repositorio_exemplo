package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Produto;
import service.ProdutoDAOService;

@WebServlet({ "/gravar", "/listar", "/buscar", "/remover" })
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TestServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ProdutoDAOService service = new ProdutoDAOService();
		if (request.getServletPath().equals("/gravar")) {
			Produto p = new Produto(request.getParameter("nmProduto"),
					Integer.parseInt(request.getParameter("quantidade")));
			
			if(service.salvar(p)) {
				response.getWriter().append("Dados gravados com sucesso!");
			}
		}
	}

}
