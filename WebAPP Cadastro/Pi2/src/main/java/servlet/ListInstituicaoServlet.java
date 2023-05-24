package servlet;

import dao.InstituicaoDAO;
import model.Funcionario;
import dao.FuncionarioDAO;
import model.Instituicao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-instituicao")
public class ListInstituicaoServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String busca = req.getParameter("busca");

       List<Instituicao> lista = new InstituicaoDAO().findAllInstituicao(busca);

        req.setAttribute("lista", lista);

        req.getRequestDispatcher("dashboard_instituicao.jsp").forward(req, resp);

    }

}
