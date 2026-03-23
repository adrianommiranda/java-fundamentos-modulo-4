import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0;
        double media =0;
        int soma =0;
        int idade;
        int maior18 =0;
        int menor5 =0;
        int maioridade = Integer.MIN_VALUE;
        while(i<9){
            System.out.printf("Entre com a %d idade", i);
            idade = scan.nextInt();

            soma = soma + idade;

            if(idade > 18){
                maior18++;
            }

            if(idade < 5){
                menor5++;
            }

            if(idade > maioridade){
                maioridade = idade;
            }
            i++;
        }

        media = soma/5;
        
        System.out.printf("Soma da idade %d e a média de idade %.2f \n",soma, media);

        System.out.println("Maior que 18 = " + maior18);
        System.out.println("Menor que 5 = " + menor5 );
        System.out.println("Maior idade = " + maioridade);

        scan.close();
    }
}
