package br.uniesp.poo.model.avaliacao01;

import java.util.ArrayList;

public class Curso {

    private int codigo;
    private String universidade;
    private String nomeCurso;
    private String coordenador;


    //SE já existir coordenador, deve ser informado para o usuário que a operação não é permitida.
    //Sendo necessário descadastrar o coordenador primeiro
    public void cadastrarCoordenador(){

    }

    public void descadastrarCoordenador(){

    }



    //Só são permitidos no máximo 6 disciplinas
    public void adicionarDisciplina(Aluno curso){
        // Implemente o código.
    }

    public void removerDisciplina(Aluno curso){
        // Implemente o código
    }



    public ArrayList<Disciplina> getDisciplinas(){
        //implemente os códigos
        return null;
    }

}
