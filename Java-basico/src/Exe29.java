import java.util.Scanner;

public class Exe29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero =0;
        int soma =0;
        int contador =0;

        while (numero !=1111) {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if (numero !=1111) {
                soma += numero;
                contador++;
                System.out.println("O total no momento está em " + soma);
                System.out.println("Digite o número 1111 para sair.");
            }

        }
        System.out.println("Você encerrou o programa após digitar " + contador + " números.");
        System.out.println("O somatório entre eles foi de " + soma + ".");
        scan.close();
    }
}
