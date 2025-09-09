package com.aula02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = leitor.nextLine();
            while (nome.isEmpty()) {
                System.out.println("Nome inválido. Digite o nome novamente: ");
                nome = leitor.nextLine();
            }

            System.out.println("Digite a primeira nota: ");
            double nota1 = leitor.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota inválida. Digite a primeira nota novamente: ");
                nota1 = leitor.nextDouble();
            }

            System.out.println("Digite a segunda nota: ");
            double nota2 = leitor.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("Nota inválida. Digite a segunda nota novamente: ");
                nota2 = leitor.nextDouble();
            }

            leitor.nextLine();

            alunos.add(new Aluno(nome, nota1, nota2));
        }

        leitor.close();

        System.out.println("\n--- Boletim ---");
        Boletim boletim = new Boletim();
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Média: " + boletim.media(aluno));
            System.out.println("Status: " + boletim.status(aluno));
            System.out.println("-----------------");
        }
    }
}
