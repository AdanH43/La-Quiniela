package com.politecnicomalaga.NasdaqOilPrices;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase respuesta. Encapsulará los datos que nos devuelve la API REST
 * opendata de Nasdaq.
 *
 * El controlador le dará el texto a "analizar" en JSON y proporcionará
 * una serialización de los datos "amigable" para la vista. Es en
 * realidad un procesador de textos (parser)
 */

public class Respuesta {
    //ESTADO
    protected String datos;


    //COMPORTAMIENTO
    public Respuesta(String entrada) {
        datos = entrada;
    }

    public List<Price> getData() {

        LinkedList<Price> dataList = new LinkedList<>();
        String marcadorInicio = "Los resultados correspondientes a la jornada de La Quiniela, del 22 de octubre de 2023, son los\n" +
                "siguientes:\n";
        String marcadorFin = "Pleno al 15 Valencia - Cádiz 2 - 0";

        int startIndex = datos.indexOf(marcadorInicio);
        int endIndex = datos.indexOf(marcadorFin, startIndex);


            String importante = datos.substring(startIndex + marcadorInicio.length(), endIndex);
            String[] lineas = importante.split("\n");

            for (String linea : lineas) {
                String[] partes = linea.trim().split(" ");

                if (partes.length >= 4) {
                    String equipoLocal = partes[0];
                    for (int i = 1; i < partes.length - 3; i++) {
                        equipoLocal += " " + partes[i];
                    }

                    String equipoVisitante = partes[partes.length - 3] + " " + partes[partes.length - 2];
                    String puntuacion = partes[partes.length - 1];

                    dataList.add(new Price(equipoLocal, equipoVisitante, puntuacion));
                }
            }

    return dataList;
}


}