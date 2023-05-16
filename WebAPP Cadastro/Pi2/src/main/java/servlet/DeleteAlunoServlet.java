package servlet;

import dao.AlunoDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-aluno")
public class DeleteAlunoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String idAluno = req.getParameter("idAluno");

        new AlunoDAO().deleteAlunoById(idAluno);

        resp.sendRedirect("/find-all-aluno");
    }
}
