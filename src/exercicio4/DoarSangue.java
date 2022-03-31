package exercicio4;

import java.util.Scanner;

public class DoarSangue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Parabéns! Você pode ser um doador de sangue!");
        } else {
            System.out.println("Sinto muito, mas você não poderá doar.");
        }

        sc.close();
    }
}
