import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor inicial");
        int inicio = scan.nextInt();

        System.out.println("Informe o valor final");
        int fim = scan.nextInt();

        System.out.println("Informe a contagem");
        int contagem = scan.nextInt();

        while(inicio <= fim){
            System.out.print(inicio + " ");
            inicio = inicio + contagem;
        }
        System.out.println("Acabou!");

        scan.close();
    }
}
