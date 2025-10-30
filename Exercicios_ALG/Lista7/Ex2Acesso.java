//Programa para controle de acesso que permite até 3 tentativas de senha 

package Lista7;
import java.util.Scanner;

public class Ex2Acesso {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 314159;
        int tentativas = 0;

        //Laço principal, permite no máximo 3 tentativas
         while (tentativas < 3) {
            System.out.print("Digite a senha: ");
            int senhaDigitada = sc.nextInt();

            tentativas = tentativas + 1; //Registra a tentativa realizada
            
            if (senhaDigitada == senhaCorreta) {
                System.out.print("Acesso autorizado ");
                break; //Sai do while antes de chegar em 3
            } else {
                System.out.println("Acesso negado (senha incorreta) ");

                if (tentativas == 3) {
                    System.out.print("Sistema bloqueado ");
                }
            }
        }

       sc.close();
    }    
}