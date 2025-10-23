package Lista6;
import java.util.Scanner;

public class Ex3Bhaskara {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do ângulo em graus: ");
        double x = sc.nextDouble(); // entre 0 e 360

        double senoAprox;

        //Bhaskara

        if (x <= 180.0) {
            double numerador = 4.0 * x * (180.0 - x);
            double denominador = 40500.0 - x * (180.0 -x);
            senoAprox = numerador / denominador;
        } else {   //180 < x <= 360
            double y = 360.0 - x;
            double numerador = 4.0 * y * (180.0 - y);
            double denominador = 40500.0 - y * (180.0 - y);
            senoAprox = - (numerador / denominador);
        }  

        //seno "real" (graus -> radianos)
        double radianos = x * (Math.PI / 180.0);
        double senoReal = Math.sin(radianos);

        System.out.printf("Valor aproximado do seno: %.4f%n", senoAprox);
        System.out.printf("Valor real do seno: %.4f%n", senoReal);
        
        sc.close();
    }
}