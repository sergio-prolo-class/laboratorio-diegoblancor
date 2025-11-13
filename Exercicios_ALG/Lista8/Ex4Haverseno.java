//Implementar a Equação de Haverseno:
//d = 2R * arcsin( sqrt( hav(φ2−φ1) + cos φ1 cos φ2 hav(λ2−λ1)))
//Onde: hav(θ) = sin²(θ/2); R = 6378.13 km; lat e lon devem ser validados dentro de seus intervalos
//Implementar uma função double hav(double θ); Implementar double distancia(...) usando hav()
//Ler as coordenadas em GRAUS, converter para RADIANOS

package Lista8;
import java.util.Scanner;

public class Ex4Haverseno {

      //Função haverseno: hav(θ) = sin²(θ/2)
    static double hav(double theta) {
        return Math.pow(Math.sin(theta / 2.0), 2); // sin(t/2)²
    }

    //Calcula a distância entre dois pontos em graus
    static double distancia(double lat1, double lon1, double lat2, double lon2) {

        double R = 6378.13; //raio médio da Terra

        //Conversão para radianos
        double p1 = Math.toRadians(lat1);
        double p2 = Math.toRadians(lat2);
        double l1 = Math.toRadians(lon1);
        double l2 = Math.toRadians(lon2);

        //Fórmula do haverseno
        double h = hav(p2 - p1) + Math.cos(p1) * Math.cos(p2) * hav(l2 - l1);

        return 2 * R * Math.asin(Math.sqrt(h)); //distância final
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lat1, lon1, lat2, lon2;

        //Validação de latitude
        do {
            System.out.print("Entre com a latitude do primeiro ponto (em graus): ");
            lat1 = sc.nextDouble();
        } while (lat1 < -90 || lat1 > 90);

        do {
            System.out.print("Entre com a longitude do primeiro ponto (em graus): ");
            lon1 = sc.nextDouble();
        } while (lon1 < -180 || lon1 > 180);

        do {
            System.out.print("Entre com a latitude do segundo ponto (em graus): ");
            lat2 = sc.nextDouble();
        } while (lat2 < -90 || lat2 > 90);

        do {
            System.out.print("Entre com a longitude do segundo ponto (em graus): ");
            lon2 = sc.nextDouble();
        } while (lon2 < -180 || lon2 > 180);

        double d = distancia(lat1, lon1, lat2, lon2);

        System.out.printf("A distância é: %.2f km%n", d);

        sc.close();
    }
}