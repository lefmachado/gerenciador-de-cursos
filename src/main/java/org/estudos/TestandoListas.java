package org.estudos;

import java.util.ArrayList;
import java.util.Collections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class TestandoListas {

    private static final Logger logger = LoggerFactory.getLogger(TestandoListas.class);

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        logger.info("Conteúdo da lista de aulas: {}", aulas);

        aulas.removeFirst();

        logger.info("--- Imprimindo aulas com for-each ---");
        for (String aula : aulas) {
            logger.info("Aula: {}", aula);
        }

        String primeiraAula = aulas.getFirst();
        logger.info("Primeira aula: {}", primeiraAula);

        logger.info("--- Imprimindo aulas com for indexado ---");
        for (int i = 0; i < aulas.size(); i++) {
            logger.info("Aula {}: {}", (i + 1), aulas.get(i));
        }

        logger.info("--- Imprimindo aulas com forEach (lambda) ---");
        aulas.forEach(aula ->
            logger.info("Aula: {}", aula));

        Collections.sort(aulas);

        logger.info("Aulas após ordenação: {}", aulas);
    }
}