package com.br.globalsolution2.classes;

//Poliformismo
public class DoencasPrevenidas extends VerificacaoDeSaude {
    private boolean riscoDeDoencas;
    private boolean indicadoresDeSaude;
    private boolean insolacao;
    private boolean dorDeCabeca;
    private boolean doencasCardiacas;
    private boolean hipertensao;
    private boolean diabetes;


    public DoencasPrevenidas(boolean riscoDeDoencas, boolean indicadoresDeSaude, boolean insolacao, boolean dorDeCabeca, boolean doencasCardiacas, boolean hipertensao, boolean diabetes) {
        this.riscoDeDoencas = riscoDeDoencas;
        this.indicadoresDeSaude = indicadoresDeSaude;
        this.insolacao = insolacao;
        this.dorDeCabeca = dorDeCabeca;
        this.doencasCardiacas = doencasCardiacas;
        this.hipertensao = hipertensao;
        this.diabetes = diabetes;
    }

    // Getters e Setters
    public boolean isRiscoDeDoencas() {
        return riscoDeDoencas;
    }

    public boolean isIndicadoresDeSaude() {
        return indicadoresDeSaude;
    }

    public boolean isInsolacao() {
        return insolacao;
    }

    public boolean isDorDeCabeca() {
        return dorDeCabeca;
    }

    public boolean isDoencasCardiacas() {
        return doencasCardiacas;
    }

    public boolean isHipertensao() {
        return hipertensao;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

// Implementação do método abstrato

    public void verificarSaude() {
        if (riscoDeDoencas || indicadoresDeSaude || insolacao || dorDeCabeca || doencasCardiacas || hipertensao || diabetes) {
            new EmRisco().verificarSaude();
        } else {
            new Saudavel().verificarSaude();
        }
    }
}
