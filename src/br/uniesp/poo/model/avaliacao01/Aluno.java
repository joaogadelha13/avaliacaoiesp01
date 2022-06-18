package br.uniesp.poo.model.avaliacao01;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno {

    private String nome;
    private int idade;
    private int codigoUniversidade;
    private String universidade;
    private String nomeCurso;
    private String coordenador;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && codigoUniversidade == aluno.codigoUniversidade && nome.equals(aluno.nome) && universidade.equals(aluno.universidade) && nomeCurso.equals(aluno.nomeCurso) && coordenador.equals(aluno.coordenador);
    }


}
