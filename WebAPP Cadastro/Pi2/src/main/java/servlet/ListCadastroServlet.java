package servlet;

import model.Cadastro;
import dao.CadastroDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-Lista")
public class ListCadastroServlet extends  HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        List<Cadastro> list = new CadastroDAO().findAllCadastro();

        req.setAttribute("list", list);

        req.getRequestDispatcher("dashboard_cadastro.jsp").forward(req,resp);
    }


}
