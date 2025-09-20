package org.estudos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    private static final Logger logger = LoggerFactory.getLogger(TestaAlunos.class);

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Aluno 1");
        alunos.add("Aluno 2");
        alunos.add("Aluno 3");
        alunos.add("Aluno 4");
        alunos.add("Aluno 5");
        alunos.add("Aluno 6");

        boolean alunoVerificado = alunos.contains("Aluno 1");
        logger.info("Aluno 1 está presente? {}", alunoVerificado);

        logger.info("Total de alunos no conjunto: {}", alunos.size());

        logger.info("--- Imprimindo alunos com for-each ---");
        for (String aluno : alunos) {
            logger.info(aluno);
        }

        logger.info("--- Imprimindo alunos com lambda forEach ---");
        alunos.forEach(aluno -> logger.info("Aluno: {}", aluno));
    }
}