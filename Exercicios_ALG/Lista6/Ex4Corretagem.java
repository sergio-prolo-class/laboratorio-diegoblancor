package Lista6;
import java.util.Scanner;

public class Ex4Corretagem {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor negociado: ");
        double valor = sc.nextDouble();

        double taxa;
        if (valor < 2500.0) {
            taxa = 30.0 + 0.017 * valor;
        } else if (valor < 6250.0) {
            taxa = 56.0 + 0.0066 * valor;
        } else if (valor <20000.0) {
            taxa = 76.0 + 0.0034 * valor;           
        } else if (valor < 50000.0) {
            taxa = 100.0 + 0.0022 * valor;          
        } else if (valor < 500000.0) {
            taxa = 155.0 + 0.0011 * valor;
        } else {
            taxa = 255.0 + 0.0009 * valor;
        }

        if (taxa < 39.0) {
            taxa = 39.0;
        }

        System.out.printf("Taxa de corretagem: R$ %.2f%n", taxa);

        sc.close();

    }
}