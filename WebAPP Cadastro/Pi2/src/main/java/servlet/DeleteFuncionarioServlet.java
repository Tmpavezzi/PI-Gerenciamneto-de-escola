package servlet;

import dao.FuncionarioDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-funcionario")
public class DeleteFuncionarioServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String idFuncionario = req.getParameter("idFuncionario");

        new FuncionarioDAO().deleteFuncionarioById(idFuncionario);

        resp.sendRedirect("/find-all-funcionarios");
    }
}