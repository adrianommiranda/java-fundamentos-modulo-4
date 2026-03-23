import java.util.Random;

public class Exe23 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] i = new int[10];
        int contador =0;
        int maior =0;
        int div =0;

        while (contador <10) {
           i[contador] = rand.nextInt(10-1+1)+1;
           contador++;
        }
        System.out.printf("Os números sorteados foram: ");
        int j =0;
        while(j < i.length){
            System.out.println(i[j]);

            if(i[j] > 5){
                maior++;
            }
            if(i[j] % 3 ==0){
                div++;
            }
            j++;
        }
        System.out.println("Há " + maior + " números maiores que 5");
        System.out.println("Há " + div + " números divísveis por 3");
    }
}
