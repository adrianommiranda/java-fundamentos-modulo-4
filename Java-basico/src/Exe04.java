import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com um número");
        int tabuada = leitor.nextInt();

        for (int i=0; i<=10; i++){
            System.out.println(i + " X " + tabuada + " = " + i*tabuada );
        }

        leitor.close();

    }
}
