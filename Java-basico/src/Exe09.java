import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Responda as perguntas de ganhe pontos");
        int i = 1;
        boolean r1 = true;
        boolean r2 = false;
        int total = 0;

        while(i <= 2){

            if(r1) {
                System.out.println("Qual o melhor time do mundo");
                String time = scan.nextLine();

                if(time.equalsIgnoreCase("Palmeiras")){
                    System.out.println("Acertou. Ganhou 1 ponto");
                    total = total +1;
                }else{
                    System.out.println("Errrrrrrooooooouuuuu!");
                }
            }

            if(r2) {
                System.out.println("Qual a capital do Brasil");
                String capital = scan.nextLine();

                if(capital.equalsIgnoreCase("Brasília")){
                    System.out.println("Acertou. Ganhou 1 ponto");
                    total = total +1;
                }else{
                    System.out.println("Errrrrrrooooooouuuuu!");
                }
            }
            r1 = false;
            r2 = true;
            i++;
        }

        System.out.println("Total de pontos = " + total);
        scan.close();
    }
}
