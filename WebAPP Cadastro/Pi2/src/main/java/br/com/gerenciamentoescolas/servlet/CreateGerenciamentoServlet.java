package br.com.gerenciamentoescolas.servlet;
import model.PI;
import  Dao.Pidao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/create-Gerenciamneto")
public class CreateGerenciamentoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        super.doPost(request, response);


        String Pi = request.getParameter("PI");




        System.out.println(Pi);

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}
