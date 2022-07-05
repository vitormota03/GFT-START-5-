package Exercicio_2;

import java.util.Scanner;

public class ClassePrincipal_Aluno {

    public static void main(String[] args) {
        int matricula, freq, reprovados;
        double nota1, nota2, nota3, notaFinal, menorNota, maiorNota, reprovadosFreq;

        Scanner ler = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ") Nº MATRÍCULA: ");
            matricula = ler.nextInt();

            System.out.print("NOTA 1: ");
            nota1 = ler.nextDouble();

            System.out.print("NOTA 2: ");
            nota2 = ler.nextDouble();

            System.out.print("NOTA 3: ");
            nota3 = ler.nextDouble();

            System.out.print("FREQUÊNCIA (nº de aulas frequentadas): ");
            freq = ler.nextInt();

            notaFinal = (nota1 + nota2 + nota3) / 3;
            if (notaFinal < 7 || freq < (75 / 100) * 10) {
                System.out.println("REPROVADO");

            } else {
                System.out.println("APROVADO");
            }
            System.out.println("\n");

        }

    }

}
