
package com.cx.model.DAO;

import com.cx.connection.ConnectionFactory;
import com.model.cxl.usuario.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    public void create(Usuario usuario){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        
        try {
            pstm = con.prepareStatement("INSERT INTO Login VALUES (?,?,?)");
            pstm.setString(1,usuario.getLogin());
            pstm.setString(2, usuario.getSenha());
            pstm.setString(3, usuario.getSexo());
            //pstm.setInt(4, usuario.getStatus());
            
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com Sucesso!!", "Cadastro Concluido!", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, pstm);
        }
    }
    
    public Usuario read(String login, String senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Usuario usuario = new Usuario();
        
        try {
            pstm = con.prepareStatement("SELECT * FROM login WHERE Login = (?) AND Senha = (?) ");
            
            pstm.setString(1, login);
            pstm.setString(2, senha);
            rs = pstm.executeQuery();
            if(rs.next()){
                usuario.setLogin(rs.getString("Login"));
                usuario.setSenha(rs.getString("Senha"));
                usuario.setSexo(rs.getString("Sexo"));
                //usuario.setStatus(rs.getInt("Status"));
            }else{
                usuario = null;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, pstm, rs);
        }
        return usuario;
    }
    
    public boolean isUsuario(Usuario user){
        boolean contem = false;
        String nome = user.getLogin();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            pstm = con.prepareStatement("SELECT Login FROM login WHERE Login = ?");
            
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            if(rs.next()){
               contem = true; 
            }else{
                contem = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, pstm, rs);
        }
        return contem;
    }
    /*public boolean loginUsuario(String name, String pass){
        boolean login = false;
        String nome = name;
        String senha = pass;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            pstm = con.prepareStatement("SELECT Login, Senha FROM login WHERE Login = ? AND Senha = ?");
            
            pstm.setString(1, nome);
            pstm.setString(2, senha);
            rs = pstm.executeQuery();
            if(rs.next()){
                login = true;
            }else{
                login = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, pstm, rs);
        }
        return login;
    }*/
}
