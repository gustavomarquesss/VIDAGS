package com.br.globalsolution2.classes;

public class PlanoDeSaude {
	private String descontosGraduados;
    private String beneficiosAdicionais;
    private String parceriasComSeguradoras;


    public PlanoDeSaude(String descontosGraduados, String beneficiosAdicionais, String parceriasComSeguradoras) {
        this.descontosGraduados = descontosGraduados;
        this.beneficiosAdicionais = beneficiosAdicionais;
        this.parceriasComSeguradoras = parceriasComSeguradoras;
    }


    public String getDescontosGraduados() {
        return descontosGraduados;
    }

    public String getBeneficiosAdicionais() {
        return beneficiosAdicionais;
    }

    public String getParceriasComSeguradoras() {
        return parceriasComSeguradoras;
    }
}
