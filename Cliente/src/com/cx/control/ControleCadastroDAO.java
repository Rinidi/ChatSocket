package com.cx.control;

import com.cx.model.DAO.UsuarioDAO;
import com.cx.model.usuario.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControleCadastroDAO {

    List<Usuario> listaUsuario = new ArrayList<>();
    UsuarioDAO dao;

    public ControleCadastroDAO() {
        this.dao = retornaDAO(dao);
    }
    public void cadastrarUsuario(String login, String senha, String sexo) {

        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senha);
        usuario.setSexo(sexo);
        usuario.setStatus(1);
        if (dao.isUsuario(usuario)) {
            JOptionPane.showMessageDialog(null, "Usuário já Cadastrado!", "Erro de Cadastro", JOptionPane.ERROR_MESSAGE);
        } else {
            dao.create(usuario);
        }
    }

//TODO
    
    public Usuario buscaUsuario(String login, String senha) {

        Usuario usuario = new Usuario();
        usuario = dao.read(login, senha);

        return usuario;
    }
    public void atualizaStatus(Usuario user){
        dao.updateStatus(user);
    }
    public boolean verificaOnline(Usuario user){
        
        boolean online = dao.isOnline(user);
        return online;
    }
    
    
    private UsuarioDAO retornaDAO(UsuarioDAO dao){
        if(dao == null){
            dao = new UsuarioDAO();
        }
        return dao;
    }
}
