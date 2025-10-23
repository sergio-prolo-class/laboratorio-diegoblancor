package Lista5;

import java.util.Scanner;

public class Ex2MediaPresenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as notas do aluno: ");
        double soma = sc.nextDouble() + sc.nextDouble() + sc.nextDouble() + sc.nextDouble();

        System.out.print("Digite a presenca do aluno (em %): ");
        int freq = sc.nextInt();

        System.out.printf(
            "Média: %.1f - %s%n",
            (soma / 4.0),
            ((soma / 4.0) >= 6.0 && freq >= 75) ? "Aprovado" : "Reprovado"
        );

        sc.close();
    }
}