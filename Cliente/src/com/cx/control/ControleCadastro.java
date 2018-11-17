package com.cx.control;

import com.cx.model.DAO.UsuarioDAO;
import com.model.cxl.usuario.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControleCadastro {

    List<Usuario> listaUsuario = new ArrayList<>();

    public void cadastrarUsuario(String login, String senha, String sexo) {

        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senha);
        usuario.setSexo(sexo);

        UsuarioDAO usuDao = new UsuarioDAO();
        if (usuDao.isUsuario(usuario)) {
            JOptionPane.showMessageDialog(null, "Usuário já Cadastrado!", "Erro de Cadastro", JOptionPane.ERROR_MESSAGE);
        } else {
            usuDao.create(usuario);
        }
    }

    /*public boolean verificaUsuario(String login) {
        boolean existe = false;

        for (int i = 0; i < listaUsuario.size(); i++) {
            if (listaUsuario.get(i).getLogin().equals(login)) {
                existe = true;
            } else {
                existe = false;
            }
        }
        return existe;
    }*/
    
    public Usuario buscaUsuario(String login, String senha) {

        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = new Usuario();
        usuario = dao.read(login, senha);

        return usuario;
    }
    /*public boolean logaUsuario(String name, String pass){
        UsuarioDAO usuDao = new UsuarioDAO();
        boolean login = usuDao.loginUsuario(name, pass);
        return login;
    }*/
}
