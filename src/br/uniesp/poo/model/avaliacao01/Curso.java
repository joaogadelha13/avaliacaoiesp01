package br.uniesp.poo.model.avaliacao01;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private int codigo;
    private String universidade;
    private String nomeCurso;
    private String coordenador;
    private ArrayList<Disciplina> disciplinas;


    public void cadastrarCoordenador(String coordenador){
        if (this.coordenador != null){
            System.out.println("É preciso descadastrar o coordenador antes de um novo");

        } else{
            this.coordenador = coordenador;
        }
    }

    public void descadastrarCoordenador(){
        this.coordenador = null;

    }



    public void adicionarDisciplina(Disciplina disciplina){
        if (this.disciplinas.size() <=6){
            this.disciplinas.add(disciplina);
        }
        else {System.out.println("Não será permitido mais de 6 disciplinas");
        }

        }




    public void removerDisciplina(Disciplina disciplina){
        this.disciplinas.remove(disciplina);
    }



    public ArrayList<Disciplina> getDisciplinas(){
        return disciplinas;
    }

}
