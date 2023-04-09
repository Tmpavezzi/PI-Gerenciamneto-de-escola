package Dao;

import model.PI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Pidao {

    public void creatPi(PI pi){

        try{
            String Sql = "INSERT INTO pi (Nome,Email,Senha) VALUES (?,?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/projetoPi?useTimezone=true&serverTimezone=UTC&useSSL=false";

            Connection connection = DriverManager.getConnection("localhost:3306","root","root");

            PreparedStatement preparedStatement
                    = connection.prepareStatement(Sql);

            preparedStatement.setString(1,pi.getName());
            preparedStatement.setString(2,pi.getEmail());
            preparedStatement.setString(3, pi.getSenha());
            preparedStatement.execute();
            System.out.println("Sucesso na conexão");
            connection.close();
        }catch (Exception e){
            System.out.println("Falha na conexão");
        }
    }
}
