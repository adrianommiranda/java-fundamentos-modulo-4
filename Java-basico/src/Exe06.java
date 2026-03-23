import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre a quantidade de dias que falta:");
        int leia = scan.nextInt();

        while (leia >= 0){
            System.out.println(leia);
            leia--;
        }
        scan.close();

    }
}
