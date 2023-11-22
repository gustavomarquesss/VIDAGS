package com.br.globalsolution2.classes;

public class Usuario {
	private String nome;
    private String telefone;
    private String RG;
    private String CPF;
    private String endereco;
    private String dataNascimento;
    private String foto;


    public Usuario(String nome, String telefone, String RG, String CPF, String endereco, String dataNascimento, String foto) {
        this.nome = nome;
        this.telefone = telefone;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.foto = foto;
    }


    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRG() {
        return RG;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getFoto() {
        return foto;
    }
}
