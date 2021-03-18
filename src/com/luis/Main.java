package com.luis;

public class Main {

    public static void main(String[] args) {
        Alumno Luis = new Alumno();
        double[] calificaciones = {89,75,80,89,95};
        Luis.setNombre("Luis Garcia");
        Luis.setCalificaciones(calificaciones);
        Luis.imprimirResultados();
    }
}
