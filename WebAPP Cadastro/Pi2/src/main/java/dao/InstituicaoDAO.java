package dao;
import model.Instituicao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstituicaoDAO {

    public static List<Instituicao> findAllInstituicao(String instCurso) {
        String SQL = "SELECT * FROM INSTITUICOES WHERE CURSO = ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");



            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, instCurso);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Instituicao> lista = new ArrayList<>();

            while(resultSet.next()) {

                String instId = resultSet.getString("id");
                String instNome = resultSet.getString("nome");
                String instiCurso = resultSet.getString("curso");
                String instLocalizacao = resultSet.getString("localizacao");

                Instituicao instituicao = new Instituicao(instId, instNome, instiCurso, instLocalizacao);

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
