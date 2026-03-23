import java.util.Scanner;

public class Exe40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Entre com um número: ");
        numero = scan.nextInt();

        for (int i =0;i <= numero;i++){
            System.out.print(i + " ");
        }

        System.out.println("FIM!");
        scan.close();
    }
}
