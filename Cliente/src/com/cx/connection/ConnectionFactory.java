package com.cx.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {

    private static final String DB = "testelogin";
    private static final String SERVER = "localhost";
    private static final String DRIVE = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String SENHA = "";
    private static final String URL = "jdbc:mysql://" + SERVER + "/" + DB;

    public static Connection getConnection() {

        try {
            Class.forName(DRIVE);
            return DriverManager.getConnection(URL, USER, SENHA);
            
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Erro de conexão", ex);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de conexão", ex);
        }
    }
    
    public static void closeConnection(Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement pstm){
        closeConnection(con);
        if(pstm != null){
            try {
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void closeConnection(Connection con, PreparedStatement pstm, ResultSet rs){
        closeConnection(con,pstm);
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
