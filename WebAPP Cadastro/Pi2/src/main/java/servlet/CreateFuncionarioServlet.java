package servlet;

import model.Funcionario;
import dao.FuncionarioDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

@WebServlet("/create-funcionario")
public class CreateFuncionarioServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException{
        String funcId = req.getParameter("idFuncionario");
        String funcNome = req.getParameter("nome");
        String funcSexo = req.getParameter("sexo");
        String funcDataNasc = req.getParameter("dataNascimento");
        String funcEstadoCivil = req.getParameter("estadoCivil");
        String funcCpf = req.getParameter("cpf");
        String funcRg = req.getParameter("rg");
        String funcOrgaoEmissor = req.getParameter("orgaoEmissor");
        String funcCelular = req.getParameter("celular");
        String funcEmail = req.getParameter("email");
        String funcEndereco = req.getParameter("endereco");
        String funcCargo = req.getParameter("cargo");
        String funcGraduacao = req.getParameter("graduacao");
        String funcConhecimento = req.getParameter("conhecimento");
        String funcObservacao = req.getParameter("observacao");

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = new Funcionario(funcId, funcNome, funcSexo, funcDataNasc, funcEstadoCivil, funcCpf, funcRg, funcOrgaoEmissor, funcCelular, funcEmail, funcEndereco,
                funcCargo, funcGraduacao, funcConhecimento, funcObservacao);

        if(null == funcId || funcId.isBlank()) {
            funcionarioDAO.createFuncionario(funcionario);
        } else {
            funcionarioDAO.updateFuncionario(funcionario);
        }

        System.out.println(funcionario);

        resp.sendRedirect("/find-all-funcionarios");
    }
}