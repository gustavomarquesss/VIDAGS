package com.br.globalsolution2.classes;
import java.util.ArrayList;
import java.util.List;

public class ListaDeConexoes {
	 private List<String> nomesConexoes;


	    public ListaDeConexoes() {
	        this.nomesConexoes = new ArrayList<>();

	        this.nomesConexoes.add("Joao");
	        this.nomesConexoes.add("Martin");
	        this.nomesConexoes.add("Murillo");
	    }


	    public List<String> getNomesConexoes() {
	        return nomesConexoes;
	    }


	    public void adicionarConexao(String nomeConexao) {
	        this.nomesConexoes.add(nomeConexao);
	    }


	    public void removerConexao(String nomeConexao) {
	        this.nomesConexoes.remove(nomeConexao);
	    }
}
