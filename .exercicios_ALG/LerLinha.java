import java.util.Scanner;
public class LerLinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);    
        System.out.println ("Digite uma linha de texto: ");
        String entrada = sc.nextLine(); //Lê a linha de texto
        System.out.println ("Você digitou: " + entrada);
        sc.close();   
    }    
} 