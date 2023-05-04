package br.com.gerenciamentoescolas.servlet;

import Dao.Pidao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/delete-pi")
public class DeletePiServlet extends  HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{

     String pid = req.getParameter("id");

     new Pidao().deletepi(pid);

        resp.sendRedirect("/find-all-Lista");
    }
}
