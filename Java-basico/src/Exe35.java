import java.util.Scanner;

public class Exe35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade =0;
        int totalIdade =0;
        int media;
        int totalPessoas =0;
        int pessoas21 =0;
        String continuar = "S";

        do {
            System.out.println("Entre com a idade: ");
            idade = scan.nextInt();
            totalIdade += idade;
            totalPessoas++;
            if (idade >=21) {
                pessoas21++;
            }
            System.out.println("Deseja continuar? (S/N)");
            continuar = scan.next();

        } while(continuar.equalsIgnoreCase("s"));

        media = totalIdade / totalPessoas;
        System.out.println("Você encerrou o programa.");
        System.out.println("Foram digitadas " + totalPessoas + " idades.");
        System.out.println("A média entre as idades digitadas é de " + media);
        System.out.println("Foram inseridas " + pessoas21 + " pessoas com 21 anos ou mais,");
        scan.close();

    }
}
