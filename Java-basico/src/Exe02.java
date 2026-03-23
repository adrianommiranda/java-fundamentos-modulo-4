import java.util.Random;
import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();

        // Gera entre 1 e 100
        int numeroSecreto = gerador.nextInt(100) + 1 ;
        int palpite = 0;
        int tentativas =0;

        System.out.println("Advinhe o número");
        System.out.println("Tente adivinhar o número entre 1 e 100!");

        while (palpite != numeroSecreto){
            System.out.println("Digite o seu palpite");
            palpite = leitor.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        }

        leitor.close();
    }
}
