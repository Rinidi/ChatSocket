package com.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ChatMessage implements Serializable
{

    private String name;
    private String senha;
    private String text;
    private boolean sex;
    private String nameReserved;
    private Set<String> setOnlines = new HashSet<String>();
    private Action action;

    Random r = new Random();
    StringBuffer sb = new StringBuffer("#");

    public String getName() {
        return name;
    }
    public void setName(String nome) {
        this.name = nome;
    }
    public String getSenha() {
        return senha;
    }
    public  void setSenha(String pass) {
        this.senha = pass;
    }
    public boolean getSex(){
        return sex;
    }
    public void setSex(boolean sexo){
        this.sex = sexo;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNameReserved() {
        return nameReserved;
    }

    public void setNameReserved(String nameReserved) {
        this.nameReserved = nameReserved;
    }

    public Set<String> getSetOnlines() {
        return setOnlines;
    }

    public void setSetOnlines(Set<String> setOnlines) {
        this.setOnlines = setOnlines;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public enum Action{
        CONNECT, DISCONNECT, SEND_ONE, SEND_ALL, USERS_ONLINE;
    }

    public String setColor() {
        while(sb.length() < 7){
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, 7);
    }

    public String getColor() {
        return sb.toString().substring(0, 7);
    }
}