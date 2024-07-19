package belajar.database.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    @Test
    void TestGetConnection(){

        String jdbcUrl = "jdbc:mysql://localhost:3306/belajar_java_database?";
        String username = "root";
        String password = "";

        try(Connection connection = DriverManager.getConnection(jdbcUrl, username, password)){

            System.out.println("Berhasil connect ke database");


        }catch (SQLException e){
            Assertions.fail(e);
        }

    }

    @Test
    void TestCLoseConnection(){

        String jdbcUrl = "jdbc:mysql://localhost:3306/belajar_java_database?";
        String username = "root";
        String password = "";

        // menggunakan try with resource, fungsinya otomatis menutup koneksi
        try(Connection connection = DriverManager.getConnection(jdbcUrl, username, password)){
            System.out.println("Berhasil connect ke database");

        }catch (SQLException e){
            Assertions.fail(e);
        }

    }

}
