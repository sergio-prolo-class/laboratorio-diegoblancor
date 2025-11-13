//Implementar todas as 6 conversões entre C, F, K usando métodos estáticos.
//Restrições:
//Fórmulas diretas apenas para conversões envolvendo C
//Conversões sem C devem ser encadeadas
//Temperatura Kelvin não pode ser negativa
//Implementar converteTemp (t, origem, destino) usando apenas chamadas às funções criadas

package Lista8;
import java.util.Scanner;

public class Ex3TempConvert {
    //Fórmulas diretas
    static double deCparaK(double t) { return t + 273.15; }
    static double deCparaF(double t) { return 1.8 * t + 32.0; }
    static double deKparaC(double t) { return t - 273.15; }
    static double deFparaC(double t) { return (t - 32.0) / 1.8; }

    //Conversões compostas
    static double deFparaK(double t) { return deCparaK(deFparaC(t)); }
    static double deKparaF(double t) { return deCparaF(deKparaC(t)); }

    //Usa apenas as funções acima
    static double converteTemp(double t, char o, char d) {

        if (o == d) return t; //mesma escala: retorna o mesmo valor

        if (o == 'C' && d == 'K') return deCparaK(t);
        if (o == 'C' && d == 'F') return deCparaF(t);

        if (o == 'K' && d == 'C') return deKparaC(t);
        if (o == 'K' && d == 'F') return deKparaF(t);

        if (o == 'F' && d == 'C') return deFparaC(t);
        if (o == 'F' && d == 'K') return deFparaK(t);

        return t;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com uma temperatura: ");
        double t = sc.nextDouble();

        System.out.print("Entre com a escala de origem (C, K ou F): ");
        char o = sc.next().charAt(0);

        System.out.print("Entre com a escala de destino (C, K ou F): ");
        char d = sc.next().charAt(0);

        //Regra: Kelvin não pode ser negativo
        if (o == 'K' && t < 0) {
            System.out.printf("Temperatura %.2f inválida para escala de origem Kelvin%n", t);
            sc.close();
            return;
        }

        double resultado = converteTemp(t, o, d);

        System.out.printf("Temperatura convertida: %.2f%n", resultado);

        sc.close();
    }        
}