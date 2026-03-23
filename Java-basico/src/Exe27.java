import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double peso =0; // entrada
        double altura =0; //entrada
        
        double mediaTotalAltura =0; //media altura total
        double somaTotalAltura =0;
        
        double pesaAcima90 =0;  
        double pesaMenos50 =0;

        double altutaAcima190 =0;

        int i=0;
        while(i<3){
            System.out.println("Leia o peso");
            peso = scan.nextDouble();

            System.out.println("Leia a altura");
            altura = scan.nextDouble();

            somaTotalAltura = somaTotalAltura + altura;

            if(peso > 90){
                altutaAcima190++;
            }

            if(peso < 50 && altura < 1.60){
                pesaMenos50++;
            }

            if(peso > 100 && altura >  1.90){
                pesaMenos50++;
            }
            i++; 
        }

        mediaTotalAltura = somaTotalAltura / 3;
        System.out.println("A média de altura do grupo foi de " + mediaTotalAltura);

        if (pesaAcima90 >0) {
            System.out.println("O total de pessoas acima dos 90kg foi de " + pesaAcima90);
        }
        if (pesaMenos50 >0) {
            System.out.println("O total de pessoas abaixo dos 50kg e menores que 1.60m foi de " + pesaMenos50);
        }
        if (altutaAcima190 >0) {
            System.out.println("O total de pessoas acima de 100kg e maiores que 1.90m foi de " + altutaAcima190);
        }
        scan.close();

    }
}
