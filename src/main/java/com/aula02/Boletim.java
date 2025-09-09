package com.aula02;

public class Boletim {
    public double media(Aluno aluno) {
        return (aluno.getNota1() + aluno.getNota2()) / 2;
    }

    public String status(Aluno aluno) {
        if (media(aluno) >= 7) {
            return "Aprovado";
        } else if (media(aluno) >= 6) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
