import java.util.Scanner;

public class Temperatura {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Digite a temperatura em ºF: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5.0 /9.0;
        System.out.println ("Temperatura em ºC: " + celsius);

        sc.close();
    }
}