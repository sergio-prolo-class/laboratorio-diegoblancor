//Programa que lê a classe do personagem e um valor de vitalidade desejado e escreve o nível
//mínimo necessário que fornece vitalidade maior ou igual a desejada para a classe escolhida.

package Lista7;
import java.util.Scanner;

public class Ex3Vitalidade {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha a classe desejada (1-Arqueiro, 2-Bárbaro, 3-Druida, 4-Mago): ");
        int classe = sc.nextInt();

        int vitalidade;
        int incremento;

        //Escolhe a vitalidade inicial e o incremento conforme a classe
        switch (classe) {
            case 1:
                vitalidade = 150;
                incremento = 10;
                break;
            case 2:
                vitalidade = 200;
                incremento = 15;
                break;     
            case 3:
                vitalidade = 1000;
                incremento = 5;
                break;     
            case 4:
                vitalidade = 80;
                incremento = 4;
                break;
            default:
                System.out.println("Classe inválida");
                sc.close();
                return;  //encerra o programa proque a classe não existe                           
        }

        System.out.print("Escolha a vitalidade desejada: ");
        int vitalidadeDesejada = sc.nextInt();

        int nivel = 0;  //inicia no nível 0

        //Laço sobe níveis até atingir ou ultrapassar da vitalidade desejada
        while (vitalidade < vitalidadeDesejada) {
            nivel = nivel +1;  //sobe 1 nível

            if (nivel % 5 == 0) {  //nível múltiplo de 5 = bônus em dobro
                vitalidade = vitalidade + (2 * incremento);
            } else {
                vitalidade = vitalidade + incremento;  //nível normal
            }
        }

        System.out.printf("Nível necessário: %d%n", nivel );

        sc.close();     
    }   
}