import java.util.Scanner;

public class Exe24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] valor  = new double[8];
        double maiorpPeco = Double.MIN_VALUE;
        double menorPreco =  Double.MAX_VALUE;
        int contador =0;
        
        while(contador < 8){
            System.out.println("Insira o valor de um produto: ");
            valor[contador] = scan.nextDouble();

            if(valor[contador] > maiorpPeco){
                maiorpPeco = valor[contador];
            }
            if(valor[contador] < menorPreco){
                menorPreco = valor[contador];
            }
            contador++;
        }
        System.out.println("O maior preço digitado foi: " + maiorpPeco);
        System.out.println("O menor preço digitado foi: " + menorPreco );

        scan.close();
    }
}
