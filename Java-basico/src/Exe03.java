import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com um número inteiro");
        int numero = leitor.nextInt();

        int i=0, soma=0;

        while(i <= numero){
            soma = soma + i;
            i++;

        }

        System.out.println("A soma dos números de 0 até " + numero + " é: " + soma);

        leitor.close();
    }
}
