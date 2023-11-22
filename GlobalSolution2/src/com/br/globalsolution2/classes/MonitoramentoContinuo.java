package com.br.globalsolution2.classes;

//Herança

public class MonitoramentoContinuo {
	private boolean acompanhamentoEmTempoReal;
    private String estiloDeVida;


    public MonitoramentoContinuo(boolean acompanhamentoEmTempoReal, String estiloDeVida) {
        this.acompanhamentoEmTempoReal = acompanhamentoEmTempoReal;
        this.estiloDeVida = estiloDeVida;
    }


    public boolean isAcompanhamentoEmTempoReal() {
        return acompanhamentoEmTempoReal;
    }

    public String getEstiloDeVida() {
        return estiloDeVida;
    }
}
