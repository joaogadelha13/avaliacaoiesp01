package br.uniesp.poo.model.avaliacao01;

import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private Professor professor;


    //Só será permitido trocar o professor 2 vezes.
    public void trocar_Professor(Professor professor){
        // Implemente o código.
    }


    //Só são permitidos no máximo 50 Alunos ativos.
    public void adicionarAluno(Aluno curso){
        // Implemente o código.
    }

    public void removerAluno(Aluno curso){
        // Implemente o código
    }

    public void ativarAluno(Aluno curso){
        // Implemente o código.
    }

    public void InativarAluno(Aluno curso){
        // Implemente o código
    }

    public ArrayList<Aluno> getAlunosAtivos(){
        //implemente os códigos
        return null;
    }

    public ArrayList<Aluno> getAlunosInativos(){
        //implemente os códigos
        return null;
    }

}
