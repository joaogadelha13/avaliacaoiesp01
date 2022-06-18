package br.uniesp.poo.model.avaliacao01;

import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private int trocasProfessor;
    private ArrayList<Aluno> alunoAtivos;
    private ArrayList<Aluno> alunoInativos;


    public Disciplina(String nome, Professor professor, ArrayList<Aluno> alunos, int trocasProfessor, ArrayList<Aluno> alunoAtivos, ArrayList<Aluno> alunoInativos) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = alunos;
        this.trocasProfessor = trocasProfessor;
        this.alunoAtivos = alunoAtivos;
        this.alunoInativos = alunoInativos;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina)) return false;
        Disciplina that = (Disciplina) o;
        return nome.equals(that.nome) && professor.equals(that.professor);
    }




    public void trocarProfessor(Professor professor){
        this.trocasProfessor = trocasProfessor +1;
        if (this.trocasProfessor <=2){
            this.professor = professor;

        }else{
            System.out.println("Maximo de troca excedidos");

        }

    }




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
