package com.br.globalsolution2.classes;

//Herança
public class ConectividadeComProfissional extends MonitoramentoContinuo {
    private String CRM;


    public ConectividadeComProfissional(boolean acompanhamentoEmTempoReal, String estiloDeVida, String CRM) {
        super(acompanhamentoEmTempoReal, estiloDeVida);
        this.CRM = CRM;
    }


    public String getCRM() {
        return CRM;
    }
}