import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0; boolean verifyInt = false;

        do {
            System.out.println("Digite um numero inteiro: ");
            try {
                x = scan.nextInt();
                verifyInt = true;
            } catch (Exception ex) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
                scan.nextLine(); //Limpa o buffer do Scanner;
            }
        }  while(!verifyInt);

        verify(x);
    }

    public static boolean eFibonacci(int n) {
        int a = 0;
        int b = 1;

        //temp armazena o atual valor de b, para que na próxima iteração, a tenha o antigo valor de b
        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == n;
    }

    public static void verify(int x) {
        if (eFibonacci(x)) {
            System.out.println(x + ": Pertence à sequência de Fibonacci");
        } else {
            System.out.println(x + ": Não pertence à sequência Fibonacci");
        }
    }
}