import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int aux;

        System.out.println("Informe o valor inicial");
        int inicio = scan.nextInt();

        System.out.println("Informe o valor final");
        int fim = scan.nextInt();

        System.out.println("Informe a contagem");
        int contagem = scan.nextInt();

        if(inicio>fim){
            aux = inicio;
            inicio = fim;
            fim = aux;
        }
        
        while(inicio <= fim){
            System.out.print(inicio + " ");
            inicio = inicio + contagem;
        }
        System.out.println("Acabou!");

        scan.close();
    }
}
