public class Exe19 {
    public static void main(String[] args) {
        
        int i = 6;
        int soma = 0;
        while(i < 101){
            System.out.print(i + " ");
            soma = soma + i;
            i+=2;
        }
        System.out.println("A soma é: " + soma);

    }
}
