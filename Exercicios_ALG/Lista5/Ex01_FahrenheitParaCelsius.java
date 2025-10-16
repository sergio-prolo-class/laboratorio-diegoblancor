package Lista5;

import java.util.Scanner;

public class Ex01_FahrenheitParaCelsius {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da temperatura em Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f -32.0) * 5.0/9.0;
        System.out.printf("Temperatura em Celsius: %.3f%n", c);
        sc.close();
    }
}