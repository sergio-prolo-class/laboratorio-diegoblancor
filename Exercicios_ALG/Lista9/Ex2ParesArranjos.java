package Lista9;
import java.util.Scanner;

public class Ex2ParesArranjos {

    //Conta quantos valores pares existem no arranjo
    static int contaPares(int[] vals) {
        int quantidade = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] % 2 == 0) {
                quantidade++;
            }
        }
        return quantidade;
    }

    //Compara os dois arranjos conforme o enunciado
    static int comparaArranjos(int[] x, int[] y) {
        int paresX = contaPares(x);
        int paresY = contaPares(y);

        if (paresX == paresY) {
            return 0;
        } else if (paresX > paresY) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o tamanho dos arranjos: ");
        int n = sc.nextInt();

        int[] primeiro = new int[n];
        int[] segundo = new int[n];

        System.out.print("Entre com os valores do primeiro: ");
        for (int i = 0; i < n; i++) {
            primeiro[i] = sc.nextInt();
        }

        System.out.print("Entre com os valores do segundo: ");
        for (int i = 0; i < n; i++) {
            segundo[i] = sc.nextInt();
        }

        int resultado = comparaArranjos(primeiro, segundo);

        if (resultado == 0) {
            System.out.println("Os arranjos possuem o mesmo número de pares");
        } else if (resultado == -1) {
            System.out.println("O primeiro arranjo possui mais pares");
        } else {
            System.out.println("O segundo arranjo possui mais pares");
        }

        sc.close();
    }
}
