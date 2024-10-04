package mains;

import classes.Aluno;
import classes.Pessoa;

import java.util.Scanner;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro: 1 para pessoa | 2 para aluno");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o nome da pessoa: ");
            String nome = scanner.next();
            System.out.println("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();
            Pessoa pessoa = new Pessoa(nome, idade);
            pessoa.mostrarDados();
        } else if (opcao == 2) {
            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.next();
            System.out.println("Digite a idade do aluno: ");
            int idade = scanner.nextInt();
            System.out.println("Digite a matrícula do aluno: ");
            int matricula = scanner.nextInt();
            System.out.println("Digite o curso do aluno: ");
            String curso = scanner.next();
            Aluno aluno = new Aluno(nome, idade, matricula, curso);
            aluno.mostrarDados();
        }
    }
}
