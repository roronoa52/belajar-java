package belajar.database.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class Statemen {

    @Test
    void TestCreateStatement() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();

        Statement statement = connection.createStatement();

        statement.close();
        connection.close();
    }

    @Test
    void testExcuteUpdate()throws SQLException{
        Connection connection = ConnectionUtil.getDataSource().getConnection();

        Statement statement = connection.createStatement();

        String sql = """
                INSERT INTO customers(id, name, email) VALUES ("1","Yp1", "yp1@gmail.com")
                """;

        int affected = statement.executeUpdate(sql);
        System.out.println(affected);

        statement.close();
        connection.close();
    }

    @Test
    void testExcuteDelete()throws SQLException{
        Connection connection = ConnectionUtil.getDataSource().getConnection();

        Statement statement = connection.createStatement();

        String sql = """
                DELETE FROM customers;
                """;

        int affected = statement.executeUpdate(sql);
        System.out.println(affected);

        statement.close();
        connection.close();
    }

    @Test
    void testExcuteQuery()throws SQLException{
        Connection connection = ConnectionUtil.getDataSource().getConnection();

        Statement statement = connection.createStatement();

        String sql = """
                SELECT * FROM customers;
                """;

        ResultSet resultSet = statement.executeQuery(sql);

        resultSet.close();
        statement.close();
        connection.close();
    }

}
