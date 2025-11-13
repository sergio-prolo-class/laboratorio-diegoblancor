//Dois números inteiros positivos são amigos quando: //somaDosDivisores(a) = b; //somaDosDivisores(b) = a
//Implementar:
//int somaDivisores(int n) usando for
//boolean saoAmigos(int n1, int n2) sem if, sem switch, sem ternário
//Ler dois inteiros positivos e informar se são amigos.

package Lista8;
import java.util.Scanner;

public class Ex2NumAmigos {

    //Soma divisores próprios (exceto o próprio n)
    static int somaDivisores(int n) {
        int soma = 0;
        for (int i = 1; i < n; i++) {        //testa todos os números menores que n
            if (n % i == 0) soma += i;      //se é divisor, soma
        }
        return soma;
    }

    //Sem if - apenas expressão lógica
    static boolean saoAmigos(int n1, int n2) {
        return somaDivisores(n1) == n2 && somaDivisores(n2) == n1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        do {
            System.out.print("Entre com um inteiro positivo: ");
            a = sc.nextInt();
        } while (a <= 0);

        do {
            System.out.print("Entre com um inteiro positivo: ");
            b = sc.nextInt();
        } while (b <= 0);

        //Aqui o if pode ser usado, só é proibido dentro da função
        if (saoAmigos(a, b)) {
            System.out.println("Os números são amigos :)");
        } else {
            System.out.println("Os números não são amigos");
        }

        sc.close();
    }
}