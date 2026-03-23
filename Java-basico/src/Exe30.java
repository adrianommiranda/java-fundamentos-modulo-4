import java.util.Scanner;

public class Exe30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salario;
        String genero;
        double salarioHomens =0;
        double salarioMulheres =0;
        String continuar = "S";

        while(continuar.equalsIgnoreCase("s")) {
            System.out.println("Digite o salário do funcionário: ");
            salario = scan.nextDouble();
            System.out.println("Digite o gênero do funcionário (M/F): ");
            genero = scan.next();

            if(genero.equalsIgnoreCase("M")) {
                salarioHomens += salario;
                System.out.println("Deseja continuar? (S/N)");
                continuar = scan.next();
            } else {
                salarioMulheres += salario;
                System.out.println("Deseja continuar? (S/N)");
                continuar = scan.next();
            }

        }

        System.out.println("Você encerrou o programa.");
        System.out.println("O total de salário pago aos homens foi de " +
                salarioHomens);
        System.out.println("O total de salário pago às mulheres foi de " +
                salarioMulheres);
        scan.close();
    }
}
