import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre comum número inteiro positivo!");
        int numero= scan.nextInt();

        int i = 0;
        
        if(numero>=0){
            while(i<=numero){
                System.out.println(i);
                i++;
            }
            System.out.println("Acabou!");
        }else{
            System.out.println("Número não é inteiro");
        }
        scan.close();        
    }
}
