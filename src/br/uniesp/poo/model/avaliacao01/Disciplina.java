package br.uniesp.poo.model.avaliacao01;

import java.util.ArrayList;
import java.util.Objects;

public class Disciplina {

    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private int trocasProfessor;
    private ArrayList<Aluno> alunoAtivos;
    private ArrayList<Aluno> alunoInativos;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina)) return false;
        Disciplina that = (Disciplina) o;
        return nome.equals(that.nome) && professor.equals(that.professor);
    }



    //Só será permitido trocar o professor 2 vezes.
    public void trocar_Professor(Professor professor){

        if (this.trocasProfessor <=2){
            this.professor = professor;
            this.trocasProfessor = trocasProfessor +1;
        }else{

        }

    }



    //Só são permitidos no máximo 50 Alunos ativos.
    public void adicionarAluno(Aluno aluno) {
            this.alunos.add(aluno);
        }



    public void removerAluno(Aluno aluno){
        this.alunos.remove(aluno);

    }

    public void ativarAluno(Aluno aluno){
        if (this.alunoAtivos.size() <=50){
            this.alunoAtivos.add(aluno);

        }

    }


    public void inativarAluno(Aluno aluno){
        this.alunoAtivos.remove(aluno);
        this.alunoInativos.add(aluno);
    }

    public ArrayList<Aluno> getAlunosAtivos(){
        return alunoAtivos;

    }

    public ArrayList<Aluno> getAlunosInativos(){
        return alunoInativos;
    }

}
