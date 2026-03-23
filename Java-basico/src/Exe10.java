import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número da tabuada:");
        int numero = scan.nextInt();
        int i = 0;
        while(i<=10){
            System.out.println(numero + " X " + i + " = " + numero*i);
            i++;
        }

        scan.close();
    }
}
