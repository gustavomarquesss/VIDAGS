package com.br.globalsolution2.classes;

public class Login {
	private String login;
    private String senha;

    
    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }


    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
