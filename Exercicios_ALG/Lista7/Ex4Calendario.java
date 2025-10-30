//Programa que lê o mês e o dia da semana e apresenta o calendário do mês em questão

package Lista7;
import java.util.Scanner;

public class Ex4Calendario {
    public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);

    int mes;
    int primeiroDia;
    int diasDoMes = 0;
    int i;   //para os espaços
    int dia; //para os dias do mês

    //Laço para garantir que o mês é valido
    do {
        System.out.print("Digite o número do mês: ");
        mes = sc.nextInt();
    } while (mes < 1 || mes > 12);   

    //Laço para que o primeiro dia é válido
    do {
        System.out.print("Digite o primeiro dia da semana: ");
        primeiroDia = sc.nextInt();       
    } while (primeiroDia < 1 || primeiroDia > 7);

    //Delimita a quantidade de dias do mês usando o switch
    switch (mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            diasDoMes = 31;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            diasDoMes = 30;
            break;
        case 2:
            diasDoMes = 28; //para ano não bissexto
            break;
    }

    System.out.println();
    System.out.println(" D  S  T  Q  Q  S  S");
    System.out.println();

    //Laço para imprimir os espaços inciais antes do primeiro dia
    for (i = 1; i < primeiroDia; i++) {
        System.out.print("   "); //3 espaços para alinhas as colunas
    }

    //Laço principal, imprime todos os dias do mês
    for (dia = 1; dia <= diasDoMes; dia++) {
        System.out.printf("%2d ", dia );

        if ((dia + primeiroDia - 1) % 7 == 0) {
            System.out.println();
        }
    }

    sc.close();

    }    
}