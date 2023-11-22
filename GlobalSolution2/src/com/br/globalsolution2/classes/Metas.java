package com.br.globalsolution2.classes;

public class Metas {
	private String definicaoDeMetas;
    private String desafiosSemanais;
    private String notificacoesMotivacionais;


    public Metas(String definicaoDeMetas, String desafiosSemanais, String notificacoesMotivacionais) {
        this.definicaoDeMetas = definicaoDeMetas;
        this.desafiosSemanais = desafiosSemanais;
        this.notificacoesMotivacionais = notificacoesMotivacionais;
    }


    public String getDefinicaoDeMetas() {
        return definicaoDeMetas;
    }

    public String getDesafiosSemanais() {
        return desafiosSemanais;
    }

    public String getNotificacoesMotivacionais() {
        return notificacoesMotivacionais;
    }
}
