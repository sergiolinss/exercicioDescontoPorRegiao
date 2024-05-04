package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
        // funcao para calcular o desconto com base em cada regiao
    public static double descontoRegiao(double valorOriginal, String regiaoProduto) {
        double descontoPorRegiao = 0.0;

        //verificando a regiao do produto
        switch (regiaoProduto.toLowerCase()) {

            case "norte":
                descontoPorRegiao = 0.5;
                break;
            case "sudeste":
                descontoPorRegiao = 0.7;
                break;
            case "nordeste":
                descontoPorRegiao = 0.12;
                break;
            case "sul":
                descontoPorRegiao = 0.15;
                break;
            case "centrooeste":
                descontoPorRegiao = 0.20;
                break;
            default:
                System.out.println("Produto importado");
                break;
        }
        // calculando valor de desconto
        double valorComDesconto = valorOriginal - (valorOriginal * descontoPorRegiao);
        return valorComDesconto;
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        scanner.nextLine(); // limpa o buffer após a leitura do número informado

        System.out.println("informe a região do produto: ");
        String regiaoProduto = scanner.nextLine();

        double valorComDesconto = descontoRegiao(valorProduto, regiaoProduto);
        System.out.println("Região do produto é " +  regiaoProduto);
        System.out.println("Valor com desconto aplicado pela região: R$ " +  valorComDesconto);
        scanner.close();
    }
}