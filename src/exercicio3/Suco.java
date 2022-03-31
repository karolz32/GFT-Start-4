package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Suco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o sabor de suco que você quer:");
        System.out.println("Digite 'L' para limão ou 'T' para tamarindo. ");
        char suco = sc.nextLine().toUpperCase().charAt(0);

        System.out.println("Diga a quantidade em litros que você deseja: ");
        double quantidade = sc.nextDouble();
        double preco = 0; //editar o preço padrão conforme as necessidades
        double valorAPagar = 0;

        switch (suco) {
            case 'L':
                if (quantidade <= 2d) {
                    valorAPagar = preco - (preco * 0.03 * quantidade);
                } else if (quantidade > 5d) {
                    valorAPagar = preco - (preco * 0.05 * quantidade);
                }
                System.out.printf("Quantidade de litros: %.1f \nTipo de suco: Limão. \n", quantidade);
                System.out.printf("Valor a pagar pelo suco: %.2f", valorAPagar);
                break;

            case 'T':
                if (quantidade <= 2d) {
                    valorAPagar = preco - (preco * 0.04 * quantidade);
                } else if (quantidade > 5d) {
                    valorAPagar = preco - (preco * 0.06 * quantidade);
                }
                System.out.printf("Quantidade de litros: %.1f \nTipo de suco: Tamarindo.\n", quantidade);
                System.out.printf("Valor a pagar pelo suco: %.2f", valorAPagar);
                break;

            default:
                System.out.println("Sabor indisponível.");
                break;
        }
        sc.close();
    }
}
