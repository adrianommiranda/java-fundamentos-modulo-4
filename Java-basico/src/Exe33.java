import java.util.Scanner;

public class Exe33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        String genero;
        int idadeTotalHomens =0;
        int maiorIdade = Integer.MIN_VALUE;
        int homens =0;
        int mulherJovem = Integer.MAX_VALUE;
        int mediaHomens =0;
        String continuar = "S";

        while(continuar.equalsIgnoreCase("s")) {
            
            System.out.println("Entre com a idade: ");
            idade = scan.nextInt();
            
            if(idade > maiorIdade) {
                maiorIdade = idade;
            }
            
            System.out.println("Entre com o gênero (M/F): ");
            genero = scan.next();
            if(genero.equalsIgnoreCase("M")) {
                idadeTotalHomens += idade;
                homens++;
            } else {
                if (idade < mulherJovem) {
                    mulherJovem = idade;
                }
            }
            
            System.out.println("Deseja continuar? (S/N)");
            continuar = scan.next();

        } 

        mediaHomens = idadeTotalHomens / homens;

        System.out.println("Você encerrou o programa.");
        System.out.println("A maior idade lida foi " + maiorIdade + " anos.");
        System.out.println("Foram cadastrados " + homens + " homens.");
        System.out.println("A mulher mais jovem inserida tem " + mulherJovem + " anos.");
        System.out.println("A idade média entre os homens inseridos " + mediaHomens + " anos.");

        scan.close();
    }
}
