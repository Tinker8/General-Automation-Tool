package com.company;
import java.sql.*;

/**
 * Created by lowtuny on 19/09/2017.
 */
public class HelloWorldJDBC
{

    public static void main(String[] args) throws SQLException {
        Connection Conn = DriverManager.getConnection("jdbc:raima:rdm://local");

        try
        {
             Statement stmt = Conn.createStatement();
             try
             {
                try
                {
                    stmt.execute("CREATE DATABASE dotaDB");
                    stmt.execute("CREATE TABLE dota_table(f00 char(31))");
                    Conn.commit(); //database shoule exist now if not before
                }
                catch (SQLException exp)
                 {
                     stmt.execute("OPEN DATABASE dotaDB"); //else open one already with the name.
                 }

                 stmt.executeUpdate("INSERT INTO dota_table VALUES (\"Hello World\")");
                 Conn.commit();
             }
             finally
             {
                 stmt.close();
             }
        }
        catch(SQLException exp)
        {

        }
        finally
        {
            Conn.close();
        }
    }
}
