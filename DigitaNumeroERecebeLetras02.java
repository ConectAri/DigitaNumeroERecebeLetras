import java.util.Scanner;

public class DigitaNumeroERecebeLetras02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        while (num1 < num2) {
            System.out.println("Hello World");
            num1++;
        }
    }
}
