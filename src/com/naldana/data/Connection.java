package com.naldana.data;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    private static Connection instance;
    private static final String password = ""; // Cambiar
    private static final String user = ""; // Cambiar
    private static final String database = ""; // Cambiar

    private Connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getInstance() {
        if (instance == null) {
            synchronized (Connection.class) {
                if (instance == null) {
                    instance = new Connection();
                }
            }
        }

        return instance;
    }

    public java.sql.Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database, user, password);
    }
}
