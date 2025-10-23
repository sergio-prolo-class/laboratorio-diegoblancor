package Diversos;
import java.util.Scanner;

public class SomaDigitos {
    public static void main (String [] args){

        // Variáveis
        int numInt;
        int soma = 0;

        // Início
        Scanner sc = new Scanner(System.in);

        // Entradas
        System.out.print("Entre com um número inteiro não-negativo: ");
        numInt = sc.nextInt();

        //Laço 
        while (numInt > 0) {
            int digito = numInt % 10; //pega o último dígito
            soma = soma + digito;     //soma o dígito à soma inicial que é zero
            numInt = numInt / 10;     //remove o último dígito para o novo numInt que irá para a próxima iteração
        }
        System.out.println ("A soma dos dígitos é: " + soma);
        sc.close();               
    }
}

//O laço percorre o número de trás para frente, pega o último dígito, soma esse dígito à variável soma e, em seguida,
//remove o último dígito do número. O processo é repetido até que não haja mais dígitos no número.