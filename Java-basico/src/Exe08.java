import java.util.Scanner;

public class Exe08
 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1;
        System.out.println("Entre com um número");
        int numero = scan.nextInt();

        while(i <= numero){
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
        scan.close();
    }
}
