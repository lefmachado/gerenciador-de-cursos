package org.estudos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestaCursoComAluno {

    private static final Logger logger = LoggerFactory.getLogger(TestaCursoComAluno.class);

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        logger.info("--- Todos os alunos matriculados ---");
        javaColecoes.getAlunos().forEach(aluno -> logger.info("{}", aluno));

        logger.info("--- Verificação de igualdade (equals e hashCode) ---");
        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        logger.info("O aluno 'turini' é o mesmo que 'a1' (pelo método equals)?");
        logger.info("Resultado: {}", turini.equals(a1));

        logger.info("a1 hashCode: {}", a1.hashCode());
        logger.info("turini hashCode: {}", turini.hashCode());

        logger.info("--- Verificando se um aluno está matriculado ---");
        logger.info("O aluno {} está matriculado?", a1);
        logger.info("Resultado: {}", javaColecoes.estaMatriculado(a1));
    }
}