package br.uniesp.poo.model.avaliacao01;

public class Professor {

    private String nome;
    private int idade;
    private String curso;

    public Professor(String nome,int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}


