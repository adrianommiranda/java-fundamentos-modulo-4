import java.util.Random;
import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int contador =1;
        int numeroSorteado = random.nextInt(10-1) +1;
        int numero;

        while(contador <=4) {
            System.out.println("Tente acertar o número: ");
            numero = scan.nextInt();
            if(numero == numeroSorteado) {
                System.out.println("Parabéns, você acertou! O número sorteado foi " + numeroSorteado);
                break;
            } else {
                System.out.println("Tente outra vez! Você ainda tem " + (4- contador) + " tentativas!");
            }

            contador++;
        }
        scan.close();

    }
}
