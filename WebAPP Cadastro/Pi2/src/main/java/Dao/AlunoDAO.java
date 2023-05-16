package dao;

import model.Aluno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlunoDAO {
    public void CreateAluno(Aluno aluno) {
        String SQL = "INSERT INTO ALUNO(nome, sexo, dataNascimento, estadoCivil, cpf, rg, orgaoEmissor, celular, email, endereco, serie, sala, turma, observacao)" +
                " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, aluno.getNome());
            preparedStatement.setString(2, aluno.getSexo());
            preparedStatement.setString(3, aluno.getDataNascimento());
            preparedStatement.setString(4, aluno.getEstadoCivil());
            preparedStatement.setString(5, aluno.getCpf());
            preparedStatement.setString(6, aluno.getRg());
            preparedStatement.setString(7, aluno.getOrgaoEmissor());
            preparedStatement.setString(8, aluno.getCelular());
            preparedStatement.setString(9, aluno.getEmail());
            preparedStatement.setString(10, aluno.getEndereco());
            preparedStatement.setString(11, aluno.getSerie());
            preparedStatement.setString(12, aluno.getSala());
            preparedStatement.setString(13, aluno.getTurma());
            preparedStatement.setString(14, aluno.getObservacao());
            preparedStatement.execute();

            System.out.println("success in insert aluno");
            connection.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("fail in database connection");
        }
    }

    public List<Aluno> findAllAluno() {
        String SQL = "SELECT * FROM ALUNO";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Aluno> list = new ArrayList<>();

            while (resultSet.next()) {
                String alunoID = resultSet.getString("idAluno");
                String alunoNome = resultSet.getString("nome");
                String alunoSexo = resultSet.getString("sexo");
                String alunoDataNasc = resultSet.getString("dataNascimento");
                String alunoEstadoCivil = resultSet.getString("estadoCivil");
                String alunoCpf = resultSet.getString("cpf");
                String alunoRg = resultSet.getString("rg");
                String alunoOrgaoEmissor = resultSet.getString("orgaoEmissor");
                String alunoCelular = resultSet.getString("celular");
                String alunoEmail = resultSet.getString("email");
                String alunoEndereco = resultSet.getString("endereco");
                String alunoSerie = resultSet.getString("serie");
                String alunoSala = resultSet.getString("sala");
                String alunoTurma = resultSet.getString("turma");
                String alunoObservacao = resultSet.getString("observacao");

                Aluno aluno = new Aluno(alunoID, alunoNome, alunoSexo, alunoDataNasc, alunoEstadoCivil, alunoCpf, alunoRg, alunoOrgaoEmissor,
                        alunoCelular, alunoEmail, alunoEndereco, alunoSerie, alunoSala, alunoTurma, alunoObservacao);

                list.add(aluno);
            }

            System.out.println("success in select * aluno");
            connection.close();
            return list;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }

    public void deleteAlunoById(String alunoID) {
        String SQL = "DELETE ALUNO WHERE idAluno = ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("success on database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, alunoID);
            preparedStatement.execute();

            System.out.println("success in delete aluno with id: " + alunoID);
            connection.close();

        } catch (Exception e) {
            System.out.println("fail in database connection");
        }
    }

    public void updateAluno(Aluno aluno) {
        String SQL = "UPDATE ALUNO SET nome = ?, sexo = ?, dataNascimento = ?, estadoCivil = ?, cpf = ?, rg = ?, orgaoEmissor = ?, celular = ?, email = ?, endereco = ?, " +
                "serie = ?, sala = ?, turma = ?, observacao = ? WHERE idAluno = ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");
            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, aluno.getNome());
            preparedStatement.setString(2, aluno.getSexo());
            preparedStatement.setString(3, aluno.getDataNascimento());
            preparedStatement.setString(4, aluno.getEstadoCivil());
            preparedStatement.setString(5, aluno.getCpf());
            preparedStatement.setString(6, aluno.getRg());
            preparedStatement.setString(7, aluno.getOrgaoEmissor());
            preparedStatement.setString(8, aluno.getCelular());
            preparedStatement.setString(9, aluno.getEmail());
            preparedStatement.setString(10, aluno.getEndereco());
            preparedStatement.setString(11, aluno.getSerie());
            preparedStatement.setString(12, aluno.getSala());
            preparedStatement.setString(13, aluno.getTurma());
            preparedStatement.setString(14, aluno.getObservacao());
            preparedStatement.setString(15, aluno.getIdAluno());
            preparedStatement.execute();

            System.out.println("success in update aluno");
            connection.close();

        } catch (Exception e) {
            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());
        }
    }

}