package br.com.guilhermedev.conversor.principal;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;

        String menu = """
                *****************************************
                Bem-vindo(a) ao Conversor de Moedas!
                
                Escolha uma opção válida:
                1) Dólar (USD) para Real (BRL)
                2) Real (BRL) para Dólar (USD)
                3) Euro (EUR) para Real (BRL)
                4) Real (BRL) para Euro (EUR)
                5) Sair
                *****************************************
                """;
            while (opcao != 5) {
                System.out.println(menu);
                System.out.print("Digite a opção desejada: ");
                opcao = leitura.nextInt();

                if(opcao >= 1 && opcao <=4) {
                    System.out.println("Digite o valor que deseja converter");
                    double valor = leitura.nextDouble();
                    System.out.println("Sua conversão será processada em breve!");
                } else if (opcao == 5) {
                    System.out.println("Finalizando o conversor. Até logo!");
                } else {
                    System.out.println("Opção inválida! Tente novamnete");
                }
            }
    }
}
