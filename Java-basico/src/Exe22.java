import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador =0;
        int par =0;
        int impar =0;

        while (contador <7) {
            System.out.println("Digite o " + (contador +1) + "º número: ");
            int i = scan.nextInt();
                if(i % 2 == 0){
                    par++;
                }else{
                    impar++;
                }
            contador++;
        }
        System.out.printf("A soma dos números pares = %d  dos impares = %d", par, impar);
        scan.close();
    }
}
