package com.clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ManejoTextos {

    // 2 Filtro Selectivo
    public static void filtroSelectivo(ArrayList<String> lista, String letra, int minimo) {
        if (lista == null) {
            return;
        }
        lista.removeIf(p -> p.toLowerCase().startsWith(letra.toLowerCase()) || p.length() < minimo);
    }

    // 3- Conversor de Mayusculas
    public static ArrayList<String> conversorMayusculas(ArrayList<String> lista) {
        if (lista == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(lista.stream().map(p -> p.toUpperCase()).collect(Collectors.toList()));
    }

    // 5- Mapa de Longitudes
    public static HashMap<String, Integer> mapaLongitudes(ArrayList<String> lista) {
        if (lista == null) {
            return new HashMap<>();
        }
        return new HashMap<>(lista.stream().collect(Collectors.toMap(p -> p, p -> p.length(), (a, b) -> a)));
    }

    // 7- Contador de Frecuencias
    public static HashMap<String, Integer> contadorFrecuencias(ArrayList<String> lista) {
        HashMap<String, Integer> conteo = new HashMap<>();
        if (lista == null) {
            return conteo;
        }
        for (String p : lista) {
            conteo.merge(p, 1, (actual, uno) -> actual + uno);
        }
        return conteo;
    }

    // 8- Clasificador de Palabras
    public static ArrayList<String> clasificadorPalabras(HashMap<String, Integer> frecuencias, int limite) {
        if (frecuencias == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(frecuencias.entrySet().stream().filter(e -> e.getValue() < limite).map(e -> e.getKey()).collect(Collectors.toList()));
    }

    // 9- Deduplicacion de Palabras
    public static HashSet<String> deduplicarPalabras(String frase, int minLetras) {
        if (frase == null || frase.trim().isEmpty()) {
            return new HashSet<>();
        }
        String[] arreglo = frase.trim().split("\\s+");
        return new HashSet<>(Arrays.stream(arreglo).filter(p -> p.length() >= minLetras).map(p -> p.toLowerCase()).collect(Collectors.toSet()));
    }
}