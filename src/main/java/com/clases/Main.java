package com.clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // 1 El Multiplicador
        System.out.println("Metodo 1: El Multiplicador");
        ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("La lista original es " + lista1);
        ManejoNumeros.multiplicarArrayList(lista1, 3);
        System.out.println("Multiplicada por 3 queda asi: " + lista1);
        ManejoNumeros.multiplicarArrayList(lista1, -2);
        System.out.println("Ahora por -2: " + lista1);
        ManejoNumeros.multiplicarArrayList(lista1, 0);
        System.out.println("Y por 0: " + lista1);

        ArrayList<Integer> lista1Vacia = new ArrayList<>();
        ManejoNumeros.multiplicarArrayList(lista1Vacia, 3);
        System.out.println("Con una lista vacia sigue igual: " + lista1Vacia);

        ManejoNumeros.multiplicarArrayList(null, 3);
        System.out.println("Con una lista nula no truena el programa");

        // 2 Filtro Selectivo
        System.out.println("\nMetodo 2: El Filtro Selectivo");
        ArrayList<String> profesiones = new ArrayList<>(
                Arrays.asList("medico", "ingeniero", "maestro", "abogado", "chef", "piloto", "mecanico", "arquitecto"));
        System.out.println("Profesiones: " + profesiones);
        ManejoTextos.filtroSelectivo(profesiones, 'm', 6);
        System.out.println("Quitando las que empiezan con m o tienen menos de 6 letras: " + profesiones);

        ArrayList<String> conNulo = new ArrayList<>(Arrays.asList("Arbol", null, "casa", "Avion"));
        ManejoTextos.filtroSelectivo(conNulo, 'a', 3);
        System.out.println("Lista con un nulo, quitando las que empiezan con a: " + conNulo);

        ArrayList<String> profesionesVacia = new ArrayList<>();
        ManejoTextos.filtroSelectivo(profesionesVacia, 'a', 3);
        System.out.println("Con la lista vacia: " + profesionesVacia);

        ManejoTextos.filtroSelectivo(null, 'a', 3);
        System.out.println("Con la lista nula tampoco hay error");

        // 3 Conversor de Mayusculas
        System.out.println("\nMetodo 3: Conversor de Mayusculas");
        ArrayList<String> minusculas = new ArrayList<>(Arrays.asList("perro", "gato", "raton"));
        System.out.println("Palabras originales: " + minusculas);
        ArrayList<String> resultado3 = ManejoTextos.conversorMayusculas(minusculas);
        System.out.println("Lista nueva en mayusculas: " + resultado3);
        System.out.println("La original no cambio: " + minusculas);

        ArrayList<String> conNulos3 = new ArrayList<>(Arrays.asList("perro", null, "gato"));
        System.out.println("Lista con un nulo: " + conNulos3);
        System.out.println("Convertida (el nulo se salta): " + ManejoTextos.conversorMayusculas(conNulos3));
        System.out.println("Con lista vacia regresa: " + ManejoTextos.conversorMayusculas(new ArrayList<>()));
        System.out.println("Con lista nula regresa: " + ManejoTextos.conversorMayusculas(null));

        // 4 Cuadrados Unicos
        System.out.println("\nMetodo 4: Cuadrados Unicos");
        ArrayList<Integer> repetidos = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 6, 7));
        System.out.println("Numeros con repetidos: " + repetidos);
        System.out.println("Cuadrados de los pares sin repetir: " + ManejoNumeros.cuadradosUnicos(repetidos));
        ArrayList<Integer> conNegativos = new ArrayList<>(Arrays.asList(-4, -2, 2, 3, -3));
        System.out.println("Con negativos " + conNegativos + ": " + ManejoNumeros.cuadradosUnicos(conNegativos));
        System.out.println("Si solo hay impares (1, 3, 5): " + ManejoNumeros.cuadradosUnicos(new ArrayList<>(Arrays.asList(1, 3, 5))));
        System.out.println("Con lista vacia: " + ManejoNumeros.cuadradosUnicos(new ArrayList<>()));
        System.out.println("Con lista nula: " + ManejoNumeros.cuadradosUnicos(null));

        // 5 Mapa de Longitudes
        System.out.println("\nMetodo 5: Mapa de Longitudes");
        ArrayList<String> colores = new ArrayList<>(Arrays.asList("rojo", "azul", "verde", "amarillo", "rojo"));
        System.out.println("Colores: " + colores);
        System.out.println("Cada color con su longitud: " + ManejoTextos.mapaLongitudes(colores));
        System.out.println("Con lista vacia: " + ManejoTextos.mapaLongitudes(new ArrayList<>()));
        System.out.println("Con lista nula: " + ManejoTextos.mapaLongitudes(null));

        // 6 Modificador de Inventario
        System.out.println("\nMetodo 6: Modificador de Inventario");
        HashMap<String, Double> inventario = new HashMap<>();
        inventario.put("Laptop", 15000.0);
        inventario.put("Mouse", 250.0);
        inventario.put("Teclado", 800.0);
        System.out.println("Catalogo con 10% de descuento:");
        ManejoNumeros.modificadorInventario(inventario);
        System.out.println("El inventario original no cambio: " + inventario);
        System.out.println("Catalogo vacio (no imprime productos):");
        ManejoNumeros.modificadorInventario(new HashMap<>());
        ManejoNumeros.modificadorInventario(null);
        System.out.println("Con catalogo nulo no hay error");

        // 7 Contador de Frecuencias
        System.out.println("\nMetodo 7: Contador de Frecuencias");
        ArrayList<String> deportes = new ArrayList<>(
                Arrays.asList("futbol", "beisbol", "futbol", "tenis", "beisbol", "futbol", "natacion"));
        System.out.println("Deportes: " + deportes);
        System.out.println("Cuantas veces sale cada uno: " + ManejoTextos.contadorFrecuencias(deportes));
        ArrayList<String> muchas = new ArrayList<>(
                Arrays.asList("si", "si", "si", "si", "si", "no", "si", "si", "no", "si"));
        System.out.println("Con muchas repeticiones " + muchas + ": " + ManejoTextos.contadorFrecuencias(muchas));
        System.out.println("Con lista vacia: " + ManejoTextos.contadorFrecuencias(new ArrayList<>()));
        System.out.println("Con lista nula: " + ManejoTextos.contadorFrecuencias(null));

        // 8 Clasificador de Palabras
        System.out.println("\nMetodo 8: Clasificador de Palabras");
        HashMap<String, Integer> mapa8 = new HashMap<>();
        mapa8.put("casa", 5);
        mapa8.put("arbol", 1);
        mapa8.put("rio", 2);
        mapa8.put("sol", 8);
        System.out.println("Palabras con sus frecuencias: " + mapa8);
        System.out.println("Las que salen menos de 3 veces: " + ManejoTextos.clasificadorPalabras(mapa8, 3));
        System.out.println("Las que salen menos de 1 vez (ninguna): " + ManejoTextos.clasificadorPalabras(mapa8, 1));
        System.out.println("El mapa original no cambio: " + mapa8);
        System.out.println("Con mapa vacio: " + ManejoTextos.clasificadorPalabras(new HashMap<>(), 3));
        System.out.println("Con mapa nulo: " + ManejoTextos.clasificadorPalabras(null, 3));

        // 9 Deduplicacion de Palabras
        System.out.println("\nMetodo 9: Deduplicacion de Palabras");
        String frase = "Estudiar Java es divertido, y estudiar con calma es mejor que estudiar con prisa.";
        System.out.println("Frase: " + frase);
        System.out.println("Palabras de 5 letras o mas sin repetir: " + ManejoTextos.deduplicacionPalabras(frase, 5));
        System.out.println("Con frase vacia: " + ManejoTextos.deduplicacionPalabras("", 5));
        System.out.println("Con puros signos: " + ManejoTextos.deduplicacionPalabras("...,,,!!!", 5));
        System.out.println("Con frase nula: " + ManejoTextos.deduplicacionPalabras(null, 5));

        // 10 El Tope de Frecuencias
        System.out.println("\nMetodo 10: El Tope de Frecuencias");
        HashMap<String, Integer> mapa10 = new HashMap<>();
        mapa10.put("a", 10);
        mapa10.put("b", 3);
        mapa10.put("c", 7);
        System.out.println("Frecuencias originales: " + mapa10);
        ManejoNumeros.topeFrecuencias(mapa10, 5);
        System.out.println("Con tope de 5 quedan asi: " + mapa10);

        HashMap<String, Integer> mapa10Vacio = new HashMap<>();
        ManejoNumeros.topeFrecuencias(mapa10Vacio, 5);
        System.out.println("Con mapa vacio: " + mapa10Vacio);

        ManejoNumeros.topeFrecuencias(null, 5);
        System.out.println("Con mapa nulo no hay error");
    }
}