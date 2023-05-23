package dao;

import model.Funcionario;
import model.Instituicao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstituicaoDAO {

    public List<Instituicao> findAllInstituicao() {
        String SQL = "SELECT * FROM INSTITUICAO";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Instituicao> lista = new ArrayList<>();

            while(resultSet.next()) {
                String instId = resultSet.getString("id");
                String instNome = resultSet.getString("nome");
                String instCurso = resultSet.getString("curso");
                String instLocalizacao = resultSet.getString("localizacao");


                Instituicao instituicao = new Instituicao(instId, instNome, instCurso, instLocalizacao);

                lista.add(instituicao);
            }

            System.out.println("success in select * instituicao");
            connection.close();
            return lista;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }

    }

}
