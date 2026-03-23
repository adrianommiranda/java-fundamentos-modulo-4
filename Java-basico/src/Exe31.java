import java.util.Scanner;

public class Exe31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade=0;
        int totalIdade =0;
        int media;
        int contador =0;

        while(idade !=999) {
            System.out.println("Digite a idade de um aluno - : 999 para encerrar");
            idade = scan.nextInt();

            
            if(idade !=999) {
                totalIdade += idade;
                contador++;
                System.out.println("Entre com a idade .");
            }

        } 

        media = totalIdade / contador;
        System.out.println("Você encerrou o programa.");
        System.out.printf("Foram inseridos %d alunos na turma.",contador);
        System.out.println("A média de idade foi de " + media);

        scan.close();
    }
}
