package servlet;

import dao.AlunoDAO;
import model.Aluno;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-aluno")
public class CreateAlunoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String alunoID = request.getParameter("idAluno");
        String alunoNome = request.getParameter("nome");
        String alunoSexo = request.getParameter("sexo");
        String alunoDataNasc = request.getParameter("dataNascimento");
        String alunoEstadoCivil = request.getParameter("estadoCivil");
        String alunoCpf = request.getParameter("cpf");
        String alunoRg = request.getParameter("rg");
        String alunoOrgaoEmissor = request.getParameter("orgaoEmissor");
        String alunoCelular = request.getParameter("celular");
        String alunoEmail = request.getParameter("email");
        String alunoEndereco = request.getParameter("endereco");
        String alunoSerie = request.getParameter("serie");
        String alunoSala = request.getParameter("sala");
        String alunoTurma = request.getParameter("turma");
        String alunoObservacao = request.getParameter("observacao");

        Aluno aluno = new Aluno(alunoID, alunoNome, alunoSexo, alunoDataNasc, alunoEstadoCivil, alunoCpf, alunoRg, alunoOrgaoEmissor,
                alunoCelular, alunoEmail, alunoEndereco, alunoSerie, alunoSala, alunoTurma, alunoObservacao);

        AlunoDAO alunoDAO = new AlunoDAO();

        if(null == alunoID || alunoID.isBlank()) {
            alunoDAO.CreateAluno(aluno);
        } else {
            alunoDAO.updateAluno(aluno);
        }

         response.sendRedirect("/find-all-aluno");
    }
}



