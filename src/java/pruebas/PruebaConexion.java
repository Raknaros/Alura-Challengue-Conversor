package pruebas;


import factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
        Connection con=new ConnectionFactory().recuperaConexion();
        System.out.println("Cerrando la conexión");

        con.close();
    }

}
