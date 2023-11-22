package com.br.globalsolution2.classes;

//Encapsulamento
public class PontuacaoDeSaude {
	private int nivel;
    private String rankingSocial;


    public PontuacaoDeSaude(int nivel, String rankingSocial) {
        this.nivel = nivel;
        this.rankingSocial = rankingSocial;
    }


    public int getNivel() {
        return nivel;
    }

    public String getRankingSocial() {
        return rankingSocial;
    }
}
