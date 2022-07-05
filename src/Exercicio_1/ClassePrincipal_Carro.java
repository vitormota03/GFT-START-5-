package Exercicio_1;

import java.util.Scanner;

public class ClassePrincipal_Carro {

    public static void main(String[] args) {

        /*entrada de dados*/
        double valor, precoFinal = 0, qntParcela = 0, vlrParcela = 0;
        int avista;

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um determinado valor para um carro: ");
        System.out.print("R$: ");
        valor = ler.nextDouble();


        /*Verificações da entrada de dados do usuário*/
        System.out.println("\nSerá pago à vista?");
        System.out.print("*1 - SIM | 2 - NÃO*: ");
        avista = ler.nextInt();

        if (avista == 1) {
            precoFinal = valor - (valor * 0.20);
            System.out.println("\nPreço Final: " + precoFinal
                    + "\nQuantidade de parcelas: " + qntParcela
                    + "\nValor da parcela " + vlrParcela);

        } else {
            precoFinal = precoFinal;

            System.out.println("\nAgora, informe em quantas parcelas deseja pagar: ");
            System.out.print("*As parcelas são (6, 12, 18, 24, 30)*: ");
            qntParcela = ler.nextDouble();

            if (qntParcela == 6) {
                precoFinal = valor + (valor * 0.03);

            } else if (qntParcela == 12) {
                precoFinal = valor + (valor * 0.06);

            } else if (qntParcela == 18) {
                precoFinal = valor + (valor * 0.09);

            } else if (qntParcela == 24) {
                precoFinal = valor + (valor * 0.12);

            } else if (qntParcela == 30) {
                precoFinal = valor + (valor * 0.15);

            } else {
                System.out.println("Opção inválida!");
            }
        }

        /*calculando o valor da parcela*/
        vlrParcela = valor * ((qntParcela / 2) / 100);

        System.out.println("\nCalculando...");

        System.out.println("\nPreço Final: " + precoFinal
                + "\nQuantidade de parcelas: " + qntParcela
                + "\nValor da parcela " + vlrParcela);

    }

}
