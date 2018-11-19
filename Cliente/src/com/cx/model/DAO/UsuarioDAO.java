
package com.cx.model.DAO;

import com.cx.connection.ConnectionFactory;
import com.cx.model.usuario.Usuario;
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
            pstm = con.prepareStatement("INSERT INTO Login VALUES (?,?,?,?)");
            pstm.setString(1,usuario.getLogin());
            pstm.setString(2, usuario.getSenha());
            pstm.setString(3, usuario.getSexo());
            pstm.setInt(4, usuario.getStatus());
            
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com Sucesso!!",
                    "Cadastro Concluido!", JOptionPane.WARNING_MESSAGE);
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
            pstm = con.prepareStatement("SELECT * FROM login WHERE Login = (?) "
                    + "AND Senha = (?) ");
            
            pstm.setString(1, login);
            pstm.setString(2, senha);
            rs = pstm.executeQuery();
            if(rs.next()){
                usuario.setID(rs.getInt("ID"));
                usuario.setLogin(rs.getString("Login"));
                usuario.setSenha(rs.getString("Senha"));
                usuario.setSexo(rs.getString("Sexo"));
                usuario.setStatus(rs.getInt("Status"));
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
    public boolean isOnline(Usuario user){
        boolean on = false;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstm  = null;
        ResultSet rs = null;
        
        int id = user.getID();
        try {
            pstm = con.prepareStatement("SELECT `Status` FROM `login` WHERE ID = ?");
            
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while(rs.next()){
                if(rs.getInt("Status") == 1){
                    on = true;
                }else{
                    on = false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, pstm, rs);
        }
        
        return on;
    }
    public void updateStatus(Usuario user){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        
        int ID = user.getID();
        int status = user.getStatus();
        
        try {
            pstm = con.prepareStatement("UPDATE `login` SET `Status`= (?)  WHERE ID = (?)");
            
            pstm.setInt(1, status);
            pstm.setInt(2, ID);
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, pstm);
        }
    }
}
