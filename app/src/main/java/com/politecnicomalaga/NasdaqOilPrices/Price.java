package com.politecnicomalaga.NasdaqOilPrices;

public class Price {

    //Aunque sabemos que precios es un double, lo guardamos en String porque nos llega en String
    //y se muestra como texto, al fin y al cabo

    //POJO CLASS
    private String equipoLocal;
    private String equipoVisitante;
    private String puntuacion;

    //Comportamiento
    //Construtor

    public Price(String equipoLocal, String equipoVisitante, String puntuacion) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.puntuacion = puntuacion;
    }


    //Getters


    public String getPuntuacion() {
        return puntuacion;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }
}
