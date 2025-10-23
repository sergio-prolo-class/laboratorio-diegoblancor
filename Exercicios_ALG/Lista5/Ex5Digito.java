package Lista5;

import java.util.Scanner;

public class Ex5Digito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a primeira parte (1 dígito): ");
        String p1 = sc.next();

        System.out.print("Entre com a segunda parte (6 dígitos): ");
        String p2 = sc.next();

        System.out.print("Entre com a terceira parte (5 dígitos, sem o DV): ");
        String p3 = sc.next();

        String codigo = p1 + p2 + p3; // 12 dígitos

        int d1  = codigo.charAt(0)  - '0';
        int d2  = codigo.charAt(1)  - '0';
        int d3  = codigo.charAt(2)  - '0';
        int d4  = codigo.charAt(3)  - '0';
        int d5  = codigo.charAt(4)  - '0';
        int d6  = codigo.charAt(5)  - '0';
        int d7  = codigo.charAt(6)  - '0';
        int d8  = codigo.charAt(7)  - '0';
        int d9  = codigo.charAt(8)  - '0';
        int d10 = codigo.charAt(9)  - '0';
        int d11 = codigo.charAt(10) - '0';
        int d12 = codigo.charAt(11) - '0';

        int soma1 = d1 + d3 + d5 + d7 + d9 + d11;   // posições ímpares (1,3,5,7,9,11)
        int soma2 = d2 + d4 + d6 + d8 + d10 + d12;  // posições pares   (2,4,6,8,10,12)
        int total = soma1 + 3 * soma2;
        int dv = 9 - ((total - 1) % 10);

        System.out.printf("Dígito verificador: %d%n", dv);

        sc.close();
    }
}