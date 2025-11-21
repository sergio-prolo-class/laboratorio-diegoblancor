package Lista9;
import java.util.Scanner;

public class Ex3DesvioPadrao {

    //Média dos valores do arranjo
    static double media(int[] vals) {
        int soma = 0;
        for (int i = 0; i < vals.length; i++) {
            soma += vals[i];
        }
        return soma / (double) vals.length;
    }

    //Desvio padrão dos valores do arranjo
    static double desvioPadrao(int[] vals) {
        double m = media(vals);
        double somaQuadrados = 0.0;

        for (int i = 0; i < vals.length; i++) {
            double diferenca = vals[i] - m;
            somaQuadrados += diferenca * diferenca;
        }

        double denominador = vals.length - 1;
        double variancia = somaQuadrados / denominador;

        return Math.sqrt(variancia);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o tamanho do arranjo: ");
        int n = sc.nextInt();

        int[] valores = new int[n];

        System.out.print("Entre com os valores do arranjo: ");
        for (int i = 0; i < n; i++) {
            valores[i] = sc.nextInt();
        }

        double dp = desvioPadrao(valores);

        System.out.printf("O desvio padrão é %.4f%n", dp);

        sc.close();
    }
}