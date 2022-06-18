package br.uniesp.poo.model.avaliacao01;

import java.util.ArrayList;

public class Universidade {

    private int codigo;
    private String universidade;
    private String diretor;
    private ArrayList<Curso> cursos;
    private ArrayList<Curso> cursosAtivos;
    private ArrayList<Curso> cursosInativos;

    public Universidade(int codigo, String universidade, String diretor, ArrayList<Curso> cursos, ArrayList<Curso> cursosAtivos, ArrayList<Curso> cursosInativos) {
        this.codigo = codigo;
        this.universidade = universidade;
        this.diretor = diretor;
        this.cursos = cursos;
        this.cursosAtivos = cursosAtivos;
        this.cursosInativos = cursosInativos;
    }

    public void adicionarCurso(Curso curso){
        this.cursos.add(curso);

    }

    public void removerCurso(Curso curso){
        this.cursos.remove(curso);
    }

    public ArrayList<Curso> getCursos(){
    return cursos;


    }

    public ArrayList<Curso> getCursosAtivos(){

        return cursosAtivos;
    }

    public ArrayList<Curso> getCursosInativos(){
        return cursosInativos;

    }

    public void ativarCurso(Curso curso){
        this.cursosAtivos.add(curso);

    }
    public void inativarCurso(Curso curso){
        this.cursosInativos.add(curso);
        this.cursosAtivos.remove(curso);
    }

}
