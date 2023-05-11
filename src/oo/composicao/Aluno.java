package oo.composicao;

import collections.List;

import java.util.ArrayList;

public class Aluno {

    String nome;
    ArrayList<Curso> cursos = new ArrayList<>();
    Aluno(String nome){
        this.nome = nome;
    }
    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
}