package com.cx.controle;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sun.security.util.Password;

public class ControleConexao {

    private String drive = "com.mysql.jdbc.Drive";
    private String db = "testelogin";
    private String server = "localhost";
    private String usuario = "root";
    private String senha = "";
    private String url = "jdbc:mysql://";
    private Connection conexao = null;

    public void getconexao() throws SQLException {
        url += server + "/" + db;
        conexao = DriverManager.getConnection(url, usuario, senha);

    }

    public ControleConexao() {
    }
    

    public void insereLogin(String pNome, String pSenha, String pSexo) throws SQLException {
        this.getconexao();
        String query = "INSERT INTO login VALUES(?,?,?)";

        PreparedStatement pstm = conexao.prepareStatement(query);
        pstm.setString(1, pNome);
        pstm.setString(2, pSenha);
        pstm.setString(3, pSexo);
        
        pstm.execute();
        pstm.close();
        conexao.close();
     }
    

}
