package org.estudos;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Aluno 1");
        alunos.add("Aluno 2");
        alunos.add("Aluno 3");
        alunos.add("Aluno 4");
        alunos.add("Aluno 5");
        alunos.add("Aluno 6");

        boolean alunoVerificado = alunos.contains("Aluno 1");
        System.out.println("Aluno 1 está presente? " + alunoVerificado);

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {
            System.out.println("Aluno: " + aluno);
        });
    }
}
