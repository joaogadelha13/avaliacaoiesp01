package br.uniesp.poo.model.avaliacao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private int codigo;
    private String universidade;
    private String nomeCurso;
    private String coordenador;
    private ArrayList<Disciplina> disciplinas;

    public Curso(int codigo, String universidade, String nomeCurso, String coordenador, ArrayList<Disciplina> disciplinas) {
        this.codigo = codigo;
        this.universidade = universidade;
        this.nomeCurso = nomeCurso;
        this.coordenador = coordenador;
        this.disciplinas = disciplinas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;
        Curso curso = (Curso) o;
        return codigo == curso.codigo && universidade.equals(curso.universidade) && nomeCurso.equals(curso.nomeCurso) && coordenador.equals(curso.coordenador) && disciplinas.equals(curso.disciplinas);
    }


    public String getCoordenador() {
        return coordenador;
    }

    public void cadastrarCoordenador(String coordenador) throws Exception {
        if (this.coordenador != null){
            throw new Exception("É preciso descadastrar o coordenador antes de cadastrar um novo.");

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
