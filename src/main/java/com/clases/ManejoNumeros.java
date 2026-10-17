package com.clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ManejoNumeros {

    // 1 Multiplicador
    public static void multiplicarArrayList(ArrayList<Integer> lista, int factor) {
        if (lista == null) {
            return;
        }
        lista.replaceAll(x -> x * factor);
    }

    // 4 Cuadrados Unicos
    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> lista) {
        if (lista == null) {
            return new HashSet<>();
        }
        return new HashSet<>(lista.stream().filter(x -> x % 2 == 0).map(x -> x * x).collect(Collectors.toSet()));
    }

    // 6 Modificador de Inventario
    public static void modificadorInventario(HashMap<String, Double> inventario) {
        if (inventario == null) {
            return;
        }
        inventario.forEach((producto, precio) -> {
            double precioFinal = precio - (precio * 0.10);
            System.out.println(producto + " cuesta $" + precio + ", con descuento queda en $" + precioFinal);
        });
    }

    // 10 Tope de Frecuencias
    public static void topeFrecuencias(HashMap<String, Integer> frecuencias, int tope) {
        if (frecuencias == null) {
            return;
        }
        frecuencias.replaceAll((palabra, veces) -> veces > tope ? tope : veces);
    }
}