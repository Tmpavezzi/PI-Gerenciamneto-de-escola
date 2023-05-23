package dao;

import model.Cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroDAO {
    public void CreateCadastro(Cadastro cadastro) {
        String SQL = "INSERT INTO CADASTRO (nome, email, senha) VALUES (?,?,?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cadastro.getNome());
            preparedStatement.setString(2, cadastro.getEmail());
            preparedStatement.setString(3, cadastro.getSenha());
            preparedStatement.execute();

            System.out.println("success in insert cadastro");
            connection.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("fail in database connection");
        }
    }

    public List<Cadastro> findAllCadastro() {
        String SQL = "SELECT * FROM CADASTRO";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Cadastro> list = new ArrayList<>();

            while (resultSet.next()) {

                String idCadastro = resultSet.getString("id");
                String cadastroNome = resultSet.getString("nome");
                String cadastroEmail = resultSet.getString("email");
                String cadastroSenha = resultSet.getString("senha");

                Cadastro cadastro = new Cadastro(idCadastro, cadastroNome, cadastroEmail, cadastroSenha);
                list.add(cadastro);
            }

            System.out.println("success in select * cadastro");
            connection.close();
            return list;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }

        public void deleteCadastroById(String cadastroID) {
        String SQL = "DELETE CADASTRO WHERE id = ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("success on database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cadastroID);
            preparedStatement.execute();

            System.out.println("success in delete aluno with id: " + cadastroID);
            connection.close();

        } catch (Exception e) {
            System.out.println("fail in database connection");
        }
    }

    public void updateCadastro(Cadastro cadastro) {
        String SQL = "UPDATE CADASTRO SET nome = ?, email = ?, senha = ? WHERE id = ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");
            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cadastro.getNome());
            preparedStatement.setString(2, cadastro.getEmail());
            preparedStatement.setString(3, cadastro.getSenha());
            preparedStatement.setString(4, cadastro.getId());
            preparedStatement.execute();

            System.out.println("success in update cadastro");
            connection.close();

        } catch (Exception e) {
            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());
        }
    }
}