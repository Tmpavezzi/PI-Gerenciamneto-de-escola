package servlet;

import model.Funcionario;
import dao.FuncionarioDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-funcionarios")
public class ListFuncionarioServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Funcionario> list = new FuncionarioDAO().findAllFuncionario();

        req.setAttribute("list", list);

        req.getRequestDispatcher("dashboard_funcionario.jsp").forward(req, resp);
    }
}
