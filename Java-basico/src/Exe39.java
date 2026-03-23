import java.util.Scanner;

public class Exe39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));

        }
        scan.close();
    }
}
