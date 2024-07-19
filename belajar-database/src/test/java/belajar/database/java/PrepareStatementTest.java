package belajar.database.java;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class PrepareStatementTest {

    @Test
    void TestPrepareStatement() throws SQLException {

        Connection connection = ConnectionUtil.getDataSource().getConnection();

        var admin = "admin1";
        var password = "12345678";

        String sql = " SELECT * FROM admins WHERE username = ? AND password = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, admin);
        preparedStatement.setString(2, password);

        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){

            System.out.println("Berhasil login dengan username " + resultSet.getString("username"));

        }else {
            System.out.println("Gagal login");
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();

    }

}
