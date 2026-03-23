import java.util.Scanner;

public class Exe36 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

        int numero;
        int soma =0;
        int menorValor = Integer.MAX_VALUE;
        int qtdNumeros =0;
        int media;
        int pares =0;
        String continuar = "S";

        do {
            System.out.println("Entre com um número:");
            numero = scan.nextInt();
            soma += numero;
            qtdNumeros++;
            if(numero %2==0) {
                pares++;
            }
            if(menorValor > numero) {
                menorValor = numero;
            }
            System.out.println("Deseja continuar? (S/N)");
            continuar = scan.next();

        } while (continuar.equalsIgnoreCase("s"));

        media = soma / qtdNumeros;
        System.out.println("Você encerrou o programa.");
        System.out.println("A soma entre os valores é " + soma);
        System.out.println("O menor valor digitado foi " + menorValor);
        System.out.println("A média entre os valores é " + media);
        System.out.println("Foram digitados " + pares + " números pares.");

        scan.close();

    }
}
