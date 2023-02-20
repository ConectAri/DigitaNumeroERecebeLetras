
/*
Crie um código que recebe 2 números e exiba no console a
 mensagem 'Hello World' enquanto o primeiro número for menor que o segundo.
 */

import java.util.Scanner;

public class DigNumeroReceberLetras01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = ler.nextInt();

        if (num1 < num2) {
            do {
                System.out.println("Hello World");
                num1++;
            } while (num1 < num2);
        }
    }

}
