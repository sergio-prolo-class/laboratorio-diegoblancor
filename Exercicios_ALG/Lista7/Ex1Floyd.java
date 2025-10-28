//Programa que lê um inteiro positivo n e escreve o Triângulo de Floyd com n linhas

package Lista7;
import java.util.Scanner;

public class Ex1Floyd {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número de linhas: ");
        int n = sc.nextInt();   //Lê um inteiro e armazena em n

        int contador = 1;       //Contador dos naturais do triângulo, começa em 1   

        //Laço externo que controla as linhas do triângulo, de 1 até n
        for (int linha = 1; linha <= n; linha++) {    
        
           //Laço interno que imprime 'linha' números na linha atual
           for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.printf("%d ", contador); //Escreve o número atual seguido de um espaço
                contador++;                                //Incrementa o contador para o próximo número
           }
           System.out.println(); //Ao terminar a linha atual, pula para a próxima linha na tela         
        }
        sc.close();
    }    
}