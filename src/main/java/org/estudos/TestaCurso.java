package org.estudos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

    private static final Logger logger = LoggerFactory.getLogger(TestaCurso.class);

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Instrutor Afonso");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        logger.info("Aulas imutáveis (ordem original): {}", aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);

        logger.info("Cópia da lista de aulas (ordenada): {}", aulas);
        logger.info("Tempo total do curso: {} minutos", javaColecoes.getTempoTotal());
        logger.info("Detalhes do curso: {}", javaColecoes);
    }
}