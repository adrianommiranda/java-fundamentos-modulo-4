import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = 0; // Contador de iterações
        int idade;
        String genero;
        
        double somaTotalIdades = 0; // soma total das idade
        int totalPessoas = 0; // total de pessoas cadastradas
        double somaIdadesHomens = 0; // soma total das idades dos homens
        int qtdHomens = 0;
        
        double somaIdadesMulheres = 0; // soma total das idades das mulheres
        int qtdMulheres = 0;
        int mulheresMaior20 = 0;

        System.out.println("Informe dados para 3 pessoas:");
        
        while (i < 3) {
            System.out.printf("Entre com a idade da %dª pessoa: ", (i + 1)); 
            idade = scan.nextInt();

            System.out.printf("Digite o gênero da %dª pessoa (M/F): ", (i + 1));
            genero = scan.next();

            somaTotalIdades += idade;
            totalPessoas++;

            if (genero.equalsIgnoreCase("M")) {
                qtdHomens++;
                somaIdadesHomens += idade;
            } else if (genero.equalsIgnoreCase("F")) { 
                qtdMulheres++;
                somaIdadesMulheres += idade;
                if (idade > 20) {
                   mulheresMaior20++;
                }
            } else {
                System.out.println("Gênero inválido inserido para a pessoa " + (i + 1) + ". Ignorando este registro para cálculo de gênero.");
                i--;
            }
            
            i++;
        }

        // Respondendo o questionário

        double mediaGeral = 0;
        if (totalPessoas > 0) {
            mediaGeral = somaTotalIdades / totalPessoas;
        }
        
        double mediaHomens = 0;
        if (qtdHomens > 0) { // Proteção contra divisão por zero
            mediaHomens = somaIdadesHomens / qtdHomens;
        }

        
        double mediaMulheres = 0;
        if (qtdMulheres > 0) {
            mediaMulheres = somaIdadesMulheres / qtdMulheres;
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Foram cadastrados " + qtdHomens + " homens.");
        System.out.println("Foram cadastrados " + qtdMulheres + " mulheres.");
        
        System.out.printf("Média de idade geral: %.2f%n", mediaGeral);
        System.out.printf("Média de idade dos homens: %.2f%n", mediaHomens);
        System.out.printf("Média de idade das mulheres: %.2f%n", mediaMulheres); 
        System.out.println("Mulheres que têm mais de 20 anos: " + mulheresMaior20);

        scan.close();
    }
}
