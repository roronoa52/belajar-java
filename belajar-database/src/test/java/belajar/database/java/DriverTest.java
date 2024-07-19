package belajar.database.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverTest {

    @Test
    void TestRegister(){

        try{

            Driver mysqlDrive = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mysqlDrive);

        }catch(SQLException exception){
            Assertions.fail(exception);
        }

    }

}
