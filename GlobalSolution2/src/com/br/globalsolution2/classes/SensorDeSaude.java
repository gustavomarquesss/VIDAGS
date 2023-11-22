package com.br.globalsolution2.classes;

public class SensorDeSaude {
	private int frequenciaCardiaca;
    private double temperaturaCorporal;
    private double niveisDeGlicose;
    private int pressaoArterial;


    public SensorDeSaude(int frequenciaCardiaca, double temperaturaCorporal, double niveisDeGlicose, int pressaoArterial) {
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.temperaturaCorporal = temperaturaCorporal;
        this.niveisDeGlicose = niveisDeGlicose;
        this.pressaoArterial = pressaoArterial;
    }


    public int getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public double getNiveisDeGlicose() {
        return niveisDeGlicose;
    }

    public int getPressaoArterial() {
        return pressaoArterial;
    }
}
