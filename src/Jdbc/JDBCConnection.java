package Jdbc;

import java.sql.*;

public class JDBCConnection {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASS = "";

    public static void main(String[] args) throws SQLException {
        // Open a connection
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            statement.executeUpdate("DROP TABLE public.user");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS public.user(id BIGINT PRIMARY KEY, name VARCHAR)");
            statement.executeUpdate("INSERT INTO public.user VALUES(1, 'Ion')");
            statement.executeUpdate("INSERT INTO public.user VALUES(2, 'Eugen')");
            statement.executeUpdate("INSERT INTO public.user VALUES(3, 'Viktor')");
            statement.executeUpdate("INSERT INTO public.user VALUES(4, 'Max')");
            statement.executeUpdate("INSERT INTO public.user VALUES(5, 'Sergiy')");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM public.user");
            
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println("-----------");
            }
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }



        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }

    }
}