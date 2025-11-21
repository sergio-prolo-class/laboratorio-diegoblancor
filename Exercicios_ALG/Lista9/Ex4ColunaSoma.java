package Lista9;
import java.util.Scanner;

public class Ex4ColunaSoma {

    //Lê uma matriz quadrada n x n
    static int[][] lerMatrizQuadrada(Scanner sc, int n) {
        int[][] matriz = new int[n][n];

        System.out.println("Entre com os valores:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        return matriz;
    }

    //Soma os elementos de uma coluna específica
    static int somaColuna(int[][] matriz, int coluna) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][coluna];
        }
        return soma;
    }

    //Retorna o índice da coluna com maior soma
    static int indiceColunaMaiorSoma(int[][] matriz) {
        int n = matriz.length;

        int indiceMaior = 0;
        int maiorSoma = somaColuna(matriz, 0);

        for (int col = 1; col < n; col++) {
            int soma = somaColuna(matriz, col);
            if (soma > maiorSoma) {
                maiorSoma = soma;
                indiceMaior = col;
            }
        }

        return indiceMaior;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o tamanho da matriz quadrada: ");
        int n = sc.nextInt();

        int[][] matriz = lerMatrizQuadrada(sc, n);

        int indice = indiceColunaMaiorSoma(matriz);

        System.out.printf("O índice da coluna com maior soma é: %d%n", indice);

        sc.close();
    }
}