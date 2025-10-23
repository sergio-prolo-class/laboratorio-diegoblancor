package Lista6;
import java.util.Scanner;

public class Ex2Triangulos {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor dos lados do triângulo: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((a + b > c) && (b + c > a) && (c + a > b) ) {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Triângulo inválido");
        }

        sc.close();
    }
}