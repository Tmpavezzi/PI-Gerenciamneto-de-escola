package dao;

import model.Funcionario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FuncionarioDAO {
    public void createFuncionario(Funcionario funcionario) {
        String SQL = "INSERT INTO FUNCIONARIO (nome, sexo, dataNascimento, estadoCivil, cpf, rg, orgaoEmissor, celular, email, endereco, cargo, graduacao, conhecimento, observacao) \n" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");
            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, funcionario.getNome());
            preparedStatement.setString(2, funcionario.getSexo());
            preparedStatement.setString(3, funcionario.getDataNascimento());
            preparedStatement.setString(4, funcionario.getEstadoCivil());
            preparedStatement.setString(5, funcionario.getCpf());
            preparedStatement.setString(6, funcionario.getRg());
            preparedStatement.setString(7, funcionario.getOrgaoEmissor());
            preparedStatement.setString(8, funcionario.getCelular());
            preparedStatement.setString(9, funcionario.getEmail());
            preparedStatement.setString(10, funcionario.getEndereco());
            preparedStatement.setString(11, funcionario.getCargo());
            preparedStatement.setString(12, funcionario.getGraduacao());
            preparedStatement.setString(13, funcionario.getConhecimento());
            preparedStatement.setString(14, funcionario.getObservacao());
            preparedStatement.execute();

            System.out.println("success in insert funcionario");
            connection.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("fail in database connection");
        }
    }

    public List<Funcionario> findAllFuncionario() {
        String SQL = "SELECT * FROM FUNCIONARIO";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Funcionario> list = new ArrayList<>();

            while(resultSet.next()) {
                String funcId = resultSet.getString("id");
                String funcNome = resultSet.getString("nome");
                String funcSexo = resultSet.getString("sexo");
                String funcDataNasc = resultSet.getString("dataNascimento");
                String funcEstadoCivil = resultSet.getString("estadoCivil");
                String funcCpf = resultSet.getString("cpf");
                String funcRg = resultSet.getString("rg");
                String funcOrgaoEmissor = resultSet.getString("orgaoEmissor");
                String funcCelular = resultSet.getString("celular");
                String funcEmail = resultSet.getString("email");
                String funcEndereco = resultSet.getString("endereco");
                String funcCargo = resultSet.getString("cargo");
                String funcGraduacao = resultSet.getString("graduacao");
                String funcConhecimento = resultSet.getString("conhecimento");
                String funcObservacao = resultSet.getString("observacao");

                Funcionario funcionario = new Funcionario(funcId, funcNome, funcSexo, funcDataNasc, funcEstadoCivil, funcCpf, funcRg, funcOrgaoEmissor, funcCelular, funcEmail, funcEndereco,
                    funcCargo, funcGraduacao, funcConhecimento, funcObservacao);

                list.add(funcionario);
            }

            System.out.println("success in select * funcionario");
            connection.close();
            return list;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }

    }

    public void deleteFuncionarioById(String funcId) {
        String SQL = "DELETE FUNCIONARIO WHERE id = ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("success on database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, funcId);
            preparedStatement.execute();

            System.out.println("success in delete funcionario with id: " + funcId);
            connection.close();

        } catch (Exception e) {
            System.out.println("fail in database connection");
        }
    }

    public void updateFuncionario(Funcionario funcionario) {
        String SQL = "UPDATE FUNCIONARIO SET nome = ?, sexo = ?, dataNascimento = ?, estadoCivil = ?, cpf = ?, rg = ?, orgaoEmissor = ?, celular = ?, email = ?, endereco = ?, " +
                "cargo = ?, graduacao = ?, conhecimento = ?, observacao = ? WHERE id = ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");
            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, funcionario.getNome());
            preparedStatement.setString(2, funcionario.getSexo());
            preparedStatement.setString(3, funcionario.getDataNascimento());
            preparedStatement.setString(4, funcionario.getEstadoCivil());
            preparedStatement.setString(5, funcionario.getCpf());
            preparedStatement.setString(6, funcionario.getRg());
            preparedStatement.setString(7, funcionario.getOrgaoEmissor());
            preparedStatement.setString(8, funcionario.getCelular());
            preparedStatement.setString(9, funcionario.getEmail());
            preparedStatement.setString(10, funcionario.getEndereco());
            preparedStatement.setString(11, funcionario.getCargo());
            preparedStatement.setString(12, funcionario.getGraduacao());
            preparedStatement.setString(13, funcionario.getConhecimento());
            preparedStatement.setString(14, funcionario.getObservacao());
            preparedStatement.setString(15, funcionario.getId());
            preparedStatement.execute();

            System.out.println("success in update funcionario");
            connection.close();

        } catch (Exception e) {
            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());
        }
    }
}