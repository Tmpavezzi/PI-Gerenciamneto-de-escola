package servlet;

import dao.AlunoDAO;
import model.Aluno;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-aluno")
public class ListAlunoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Aluno> list = new AlunoDAO().findAllAluno();

        req.setAttribute("list", list);

        req.getRequestDispatcher("dashboard_aluno.jsp").forward(req, resp);
    }
}
