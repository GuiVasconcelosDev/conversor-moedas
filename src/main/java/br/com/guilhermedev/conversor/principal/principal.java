package br.com.guilhermedev.conversor.principal;

import br.com.guilhermedev.conversor.api.ConexaoAPI;
import br.com.guilhermedev.conversor.model.Moeda;

import java.util.Scanner;

public class principal {
    static void main() {
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

                    String moedaBase;
                    String moedaAlvo;

                    if (opcao == 1) {
                        moedaBase = "USD";
                        moedaAlvo = "BRL";
                    } else if (opcao == 2) {
                        moedaBase = "BRL";
                        moedaAlvo = "USD";
                    } else if (opcao == 3) {
                        moedaBase = "EUR";
                        moedaAlvo = "BRL";
                    } else {
                        moedaBase = "BRL";
                        moedaAlvo = "EUR";
                    }

                    System.out.println("Processando sua conversão...");

                    ConexaoAPI api = new ConexaoAPI();
                    Moeda cotacao = api.buscarTaxa(moedaBase, moedaAlvo);

                    if (cotacao != null) {
                        double valorConvertido = valor * cotacao.conversionRate();
                        System.out.printf("Valor %.2f [%s] corresponde ao valor final de => %.2f [%s]\n\n", valor, moedaBase, valorConvertido, moedaAlvo);
                    }
                } else if (opcao == 5) {
                    System.out.println("Finalizando o conversor. Até logo!");
                } else {
                    System.out.println("Opção inválida! Tente novamnete");
                }
            }
    }
}
