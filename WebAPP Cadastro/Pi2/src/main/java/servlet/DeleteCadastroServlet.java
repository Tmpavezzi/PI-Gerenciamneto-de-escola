package servlet;

import dao.CadastroDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/delete-cadastro")
public class DeleteCadastroServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        String cadastro = req.getParameter("idCadastro");

        new CadastroDAO().deleteCadastroById(cadastro);

        resp.sendRedirect("/find-all-Lista");
    }
}
