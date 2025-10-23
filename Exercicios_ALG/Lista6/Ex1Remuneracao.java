package Lista6;
import java.util.Scanner;

public class Ex1Remuneracao {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Digite o valor total de vendas (R$) : ");
        double vendas = sc.nextDouble();

        System.out.print("Digite a nota da avaliação de desempenho (1-10): ");
        int avaliacao = sc.nextInt();

        double salarioFixo = 2000.0;
        
        double taxa;
        if (vendas >= 10000.0) {
            taxa = 0.07;
        } else {
            taxa = 0.05;
        }
        
        double comissao = vendas * taxa;

        double bonus = 0.0;
        if (avaliacao >= 8) {
            bonus = 500.0;
        }

        double remuneracao = salarioFixo + comissao + bonus;

        System.out.printf("Remuneração: R$ %.2f%n", remuneracao);

        sc.close();
    }
}