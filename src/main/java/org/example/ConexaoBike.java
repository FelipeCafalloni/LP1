package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBike {
public static Connection getConnection() throws SQLException{
    String url = "jdbc:mysql://localhost:3306/ciclismo";
    String user = "felipe";
    String password = "1234";

    return DriverManager.getConnection(url, user, password);
}
}
