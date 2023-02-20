# DigitaNumeroERecebeLetras

<h2>Enunciado do projeto:</h2>


Crie um código que recebe 2 números e exiba no console a mensagem 'Hello World' enquanto o primeiro número for menor que o segundo.

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


Este código começa solicitando ao usuário que digite os dois números que serão utilizados como entrada.

Em seguida, ele entra em um loop while que verifica se o primeiro número é menor que o segundo.

Se for, a mensagem "Hello World" é exibida no console e o valor do primeiro número é incrementado.

O loop continua executando enquanto o primeiro número for menor que o segundo.

<h2>Resultado no Console:</h2>

Digite o primeiro número: 2
========================
Digite o segundo número: 7
Hello World
Hello World
Hello World
Hello World
Hello World
