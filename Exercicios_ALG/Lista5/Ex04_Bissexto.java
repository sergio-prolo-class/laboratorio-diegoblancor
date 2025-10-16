package Lista5;

import java.util.Scanner;

public class Ex04_Bissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o ano: ");
        int ano = sc.nextInt();

        boolean b = (ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0));
        System.out.println(b ? "É bissexto." : "Não é bissexto.");

        sc.close();
    }
}