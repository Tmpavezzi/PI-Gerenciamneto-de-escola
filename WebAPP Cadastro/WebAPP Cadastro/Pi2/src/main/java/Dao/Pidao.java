package Dao;

import model.PI;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Pidao {

    public void creatPi(PI pi){
        String Sql = "INSERT INTO pi (Nome,Email,Senha) VALUES (?,?,?)";

        try{

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

                    PreparedStatement preparedStatement = connection.prepareStatement(Sql);

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

   public List<PI> findallLista(){

     String SQL = "SELECT * FROM PI";

     try{

         Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");

         System.out.println("success in database connection");

         PreparedStatement preparedStatement = connection.prepareStatement(SQL);

         ResultSet resultSet = preparedStatement.executeQuery();

          List<PI>lista =new ArrayList<>();

         while (resultSet.next()){

             String name = resultSet.getString("NOME");
             String Email = resultSet.getString("EMAIL");
             String Senha = resultSet.getString("SENHA");
             String id = resultSet.getString("Id");

             PI pi = new PI(name,Email,Senha,id);

             lista.add(pi);
         }

         System.out.println("Sucesso no Select");

         connection.close();

         return lista;


     } catch (SQLException e) {
         System.out.println("Falha na conexão");

          return Collections.emptyList();
     }
   }

   public void deletepi (String pid){

        String SQL = "DELETE PI WHERE ID = ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("Sucesso ");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1,pid);
            preparedStatement.execute();

            System.out.println("Sucesso no delete"+pid);

            connection.close();


        } catch (SQLException e) {
            System.out.println("Fail no delete ");
            System.out.println(e.getMessage());

        }
   }

   public void updatepi (PI pi){
       String SQL = "UPDATE PI SET NOME = ?, EMAIL = ?, SENHA = ? WHERE ID = ?";

       try{
           Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

           PreparedStatement preparedStatement =connection.prepareStatement(SQL);

           preparedStatement.setString(1,pi.getName());
           preparedStatement.setString(4, pi.getId());
           preparedStatement.setString(2, pi.getEmail());
           preparedStatement.setString(3,pi.getSenha());
           preparedStatement.execute();

           connection.close();


       } catch (SQLException e) {
           System.out.println(e.getMessage());;
       }
   }
}
