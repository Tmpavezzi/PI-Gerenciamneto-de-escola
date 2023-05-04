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

              String name =request.getParameter("nome_cad");
              String Email = request.getParameter("email_cad");
              String Senha = request.getParameter("senha_cad");
              String id = request.getParameter("id");




             PI pi= new PI(name,Email,Senha,id);
              Pidao pidao = new Pidao();


              if(null ==id||id.isBlank()){
               pidao.creatPi(pi);
              }else{
                 pidao.updatepi(pi);


              }

                response.sendRedirect("/find-all-Lista");









    }
}
