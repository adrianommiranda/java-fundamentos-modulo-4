import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorTotal = 0;
        String continua = "s";

        System.out.println("Loja de Tintas de Seu Alfredo");

        while (continua.equalsIgnoreCase("s")){
            System.out.println("Informe a quantas latas foram vendidas:");
            int qtd = scan.nextInt();

            System.out.println("O preço de cada lata:");
            double preco = scan.nextDouble();

            valorTotal = valorTotal + preco*qtd;

            scan.nextLine();

            System.out.println("deseja continuar cadastrando:");
            String leia = scan.nextLine();

            continua = leia;

        }

        System.out.printf("Valor total de vendas foram: RS%.2f", valorTotal);

        scan.close();

    }
}
