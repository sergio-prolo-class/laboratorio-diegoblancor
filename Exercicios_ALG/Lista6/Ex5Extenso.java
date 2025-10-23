package Lista6;

import java.util.Scanner;

public class Ex5Extenso {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 1 a 99: ");
        int n = sc.nextInt();

        if (n < 1 || n > 99) {
            System.out.println("Valor inválido");
            sc.close();
            return;
        }
        
        String resultado;

        if (n < 20) {
            switch (n) {
                case 1: resultado = "um"; break;
                case 2: resultado = "dois"; break;
                case 3: resultado = "três"; break;
                case 4: resultado = "quatro"; break;
                case 5: resultado = "cinco"; break;
                case 6: resultado = "seis"; break;
                case 7: resultado = "sete"; break;
                case 8: resultado = "oito"; break;
                case 9: resultado = "nove"; break;
                case 10: resultado = "dez"; break;
                case 11: resultado = "onze"; break;
                case 12: resultado = "doze"; break;
                case 13: resultado = "treze"; break;
                case 14: resultado = "quatorze"; break;
                case 15: resultado = "quinze"; break;
                case 16: resultado = "dezesseis"; break;
                case 17: resultado = "dezessete"; break;
                case 18: resultado = "dezoito"; break;
                default: resultado = "dezenove"; 
            }
        } else {
            int dez = n / 10;
            int uni = n % 10;

            String dezena;
            switch (dez) {
                case 2: dezena = "vinte"; break;
                case 3: dezena = "trinta"; break;
                case 4: dezena = "quarenta"; break;
                case 5: dezena = "cinquenta"; break;
                case 6: dezena = "sessenta"; break;
                case 7: dezena = "setenta"; break;
                case 8: dezena = "oitenta"; break;
                default: dezena = "noventa";
            }

            if (uni == 0) {
                resultado = dezena;
            } else {
                String unidade;
                switch (uni) {
                    case 1: unidade = "um"; break;
                    case 2: unidade = "dois"; break;
                    case 3: unidade = "três"; break;
                    case 4: unidade = "quatro"; break;
                    case 5: unidade = "cinco"; break;
                    case 6: unidade = "seis"; break;
                    case 7: unidade = "sete"; break;
                    case 8: unidade = "oito"; break;
                    default: unidade = "nove";
                }

                resultado = dezena + " e " + unidade; 
            }            
        }

        System.out.println("Número por extenso: " + resultado);

        sc.close();
        
    }
}
