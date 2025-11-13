//Alterar o programa para:
//Ler a quantidade de alunos (≥ 1)
//Ler 3 notas de prova e 3 notas de trabalho, validando 0–10
//Calcular a média final usando as duas maiores notas de cada categoria
//Exibir a média final de cada aluno
//Ao final, exibir a média da disciplina (média das médias)

package Lista8;
import java.util.Scanner;

public class Ex1Media {

    //Função para garantir que a nota está entre 0 e 10
    static double lerNota(Scanner sc) {
        double n;
        do {
            System.out.print("Nota (0 a 10): ");
            n = sc.nextDouble();
        } while (n < 0 || n > 10); //validação do intervalo
        return n;
    }

    // Calcula a média das duas maiores notas dentre três
    static double media2maiores(double a, double b, double c) {

        //Encontra a menor das três para descartá-la
        double menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        //Soma total - menor = sobra soma das duas maiores
        return (a + b + c - menor) / 2.0;
    }

    //Calcula a média final do aluno
    static double mediaFinal(double p1, double p2, double p3,
                             double t1, double t2, double t3) {

        double mediaProvas = media2maiores(p1, p2, p3); //80%
        double mediaTrab   = media2maiores(t1, t2, t3); //20%

        return 0.8 * mediaProvas + 0.2 * mediaTrab;
    }

      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Lê a quantidade de alunos >= 1
        int qtd;
        do {
            System.out.print("Entre com o número de alunos: ");
            qtd = sc.nextInt();
        } while (qtd < 1);

        double somaMedias = 0.0; //acumula a média de todos os alunos

        for (int i = 1; i <= qtd; i++) {  //laço para cada aluno
            System.out.printf("Entre com as notas das provas do aluno %d:%n", i);
            double p1 = lerNota(sc);
            double p2 = lerNota(sc);
            double p3 = lerNota(sc);

            System.out.printf("Entre com as notas dos trabalhos do aluno %d:%n", i);
            double t1 = lerNota(sc);
            double t2 = lerNota(sc);
            double t3 = lerNota(sc);

            double media = mediaFinal(p1, p2, p3, t1, t2, t3);
            somaMedias += media; // soma para calcular média da disciplina

            System.out.printf("Média final do aluno %d: %.2f%n", i, media);
        }

        // Média da disciplina = soma das médias / quantidade de alunos
        double mediaDisciplina = somaMedias / qtd;
        System.out.printf("Média da disciplina: %.2f%n", mediaDisciplina);

        sc.close();
    }
}