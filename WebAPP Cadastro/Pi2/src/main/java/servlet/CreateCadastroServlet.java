package servlet;

import model.Cadastro;
import dao.CadastroDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-cadastro")
public class CreateCadastroServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cadastroId = request.getParameter("idCadastro");
        String cadastroNome = request.getParameter("nome");
        String cadastroEmail = request.getParameter("email");
        String cadastroSenha = request.getParameter("senha");

        Cadastro cadastro = new Cadastro(cadastroId, cadastroNome, cadastroEmail,cadastroSenha);
        CadastroDAO cadastroDAO = new CadastroDAO();

        if(null == cadastroId || cadastroId.isBlank()){
            cadastroDAO.CreateCadastro(cadastro);
        }else{
            cadastroDAO.updateCadastro(cadastro);
        }

        response.sendRedirect("/find-all-Lista");
    }
}
