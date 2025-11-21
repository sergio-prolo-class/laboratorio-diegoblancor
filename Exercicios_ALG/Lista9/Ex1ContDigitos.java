package Lista9;
import java.util.Scanner;

public class Ex1ContDigitos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        //Leitura com validação: 1 a 999999999
        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 999999999);

        int[] contagem = new int[10]; //índices 0..9 representam os dígitos

        int n = numero;
        while (n > 0) {
            int digito = n % 10;
            contagem[digito]++;
            n /= 10;
        }

        System.out.println("Quantidade de cada dígito");

        for (int d = 0; d < 10; d++) {
            if (contagem[d] > 0) {
                if (contagem[d] == 1) {
                    System.out.printf("%d: %d vez%n", d, contagem[d]);
                } else {
                    System.out.printf("%d: %d vezes%n", d, contagem[d]);
                }
            }
        }

        sc.close();
    }
}