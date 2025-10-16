package Lista5;

import java.util.Scanner;

public class Ex03_Moedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a quantidade de centavos: ");
        int v = sc.nextInt();

        System.out.printf("Moedas de 50 centavos: %d%n", v / 50); v = v % 50;
        System.out.printf("Moedas de 25 centavos: %d%n", v / 25); v = v % 25;
        System.out.printf("Moedas de 10 centavos: %d%n", v / 10); v = v % 10;
        System.out.printf("Moedas de 05 centavos: %d%n", v / 5 ); v = v % 5;
        System.out.printf("Moedas de 01 centavo: %d%n", v);

        sc.close();
    }
}