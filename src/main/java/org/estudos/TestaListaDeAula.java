package org.estudos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    private static final Logger logger = LoggerFactory.getLogger(TestaListaDeAula.class);

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArraysLists", 21);
        Aula a2 = new Aula("Listas de Objetos", 20);
        Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        logger.info("Aulas na ordem de inserção: {}", aulas);

        Collections.sort(aulas);

        logger.info("Aulas após ordenação natural (por nome): {}", aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));

        logger.info("Aulas após ordenação por tempo (usando Collections.sort): {}", aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));
        logger.info("Aulas após ordenação por tempo (usando aulas.sort): {}", aulas);
    }
}