package org.estudos;

import java.util.ArrayList;
import java.util.Collections;

class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "Introdução ao Java";
        String aula2 = "Estruturas de Controle";
        String aula3 = "Estruturas de Repetição";
        String aula4 = "Orientação a Objetos";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);

        System.out.println(aulas);

        aulas.removeFirst();

        for (String aula : aulas) {
            System.out.println(aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("Primeira aula: " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula " + (i + 1) + ": " + aulas.get(i));
        }

        aulas.forEach(aula -> {
            System.out.println(aula);
        });

        Collections.sort(aulas);

        System.out.println(aulas);

    }
}