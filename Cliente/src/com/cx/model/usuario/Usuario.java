
package com.cx.model.usuario;

public class Usuario {
    
    private String login;
    private String senha;
    private String sexo;
    private String Nick;
    private int status;
    private int ID;
    
    public Usuario() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getNick(){
        return Nick;
    }
    
    public void setNick(String nick){
        this.Nick = nick;
    }
    
}
