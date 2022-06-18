package br.uniesp.poo.model.avaliacao01;

import java.util.ArrayList;
import java.util.Arrays;

public class aplicacao01 {
    //  Execute aqui a aplicação provabdo que deu tudo certo.
    public static void main(String[] args) {
        Aluno joao = new Aluno("joao", 23, 1209898, "UNIESP", "Sistemas para internet", "Marcelo");

        Curso medicina = new Curso(1542,"UFPB","Medicina","Gustavo", new ArrayList<>());


        try {
            medicina.cadastrarCoordenador("Marcelo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } try {
           medicina.descadastrarCoordenador();
            medicina.cadastrarCoordenador("Marcelo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("coordenador: "+medicina.getCoordenador());
        Universidade universidade = new Universidade(123656,"UNIESP","Fujioka", new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        Professor pedro = new Professor("Pedro",58,"Medicina");
        Professor eduardo = new Professor("Eduardo",51,"Medicina");
        Disciplina anatomia = new Disciplina("Anatomia",eduardo,new  ArrayList<>(),0,new ArrayList<>(), new ArrayList<>());
        anatomia.adicionarAluno(joao);
        universidade.adicionarCurso(medicina);
        medicina.adicionarDisciplina(anatomia);
        System.out.println(Arrays.toString(universidade.getCursos().toArray()));
        anatomia.trocarProfessor(pedro);
        System.out.println("professor:" +anatomia.getProfessor());
        anatomia.trocarProfessor(eduardo);
        System.out.println("professor:" +anatomia.getProfessor());
        anatomia.trocarProfessor(pedro);
        System.out.println("professor:" +anatomia.getProfessor());


    }

}