package org.estudos;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

    private final String nome;
    private final String instrutor;
    private final List<Aula> aulas = new LinkedList<>();
    private final Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {

        return nome;
    }

    public String getInstrutor() {

        return instrutor;
    }

    public List<Aula> getAulas() {

        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {

        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        return this.aulas.stream()
                .mapToInt(Aula::getTempo)
                .sum();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                '}';
    }

    public void matricula(Aluno aluno) {

        this.alunos.add(aluno);
    }

    public Set<Aluno> getAlunos() {

        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno a1) {
        return this.alunos.contains(a1);
    }
}
