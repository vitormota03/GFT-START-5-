package Exercicio_3;

import java.util.Scanner;

public class ClassePrincipal_Eleicao {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, branco = 0, nulo = 0, voto;

        System.out.println("Digite 1 para CANDIDATO(1)");
        System.out.println("Digite 2 para CANDIDATO(2)");
        System.out.println("Digite 3 para CANDIDATO(3)");
        System.out.println("Digite 4 para CANDIDATO(4)");
        System.out.println("Digite 5 para VOTO NULO");
        System.out.println("Digite 6 para VOTO EM BRANCO");

        do {
            System.out.print("\nDigite seu voto: ");
            voto = ler.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;

                case 2:
                    candidato2++;
                    break;

                case 3:
                    candidato3++;
                    break;

                case 4:
                    candidato4++;
                    break;

                case 5:
                    branco++;
                    break;

                case 6:
                    nulo++;
                    break;

                case 0:
                    System.out.println("Votação finalizada.");
                    break;

                default:
                    System.out.println("Voto inválido!");
                    break;

            }

        } while (voto != 0);

        System.out.println("\nContagem dos votos:");
        System.out.println("CANDIDATO(1): " + candidato1);
        System.out.println("CANDIDATO(2): " + candidato2);
        System.out.println("CANDIDATO(3): " + candidato3);
        System.out.println("CANDIDATO(4): " + candidato4);
        System.out.println("VOTO NULO: " + nulo);
        System.out.println("VOTO EM BRANCO: " + branco);

    }

}
