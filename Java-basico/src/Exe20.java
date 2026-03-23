public class Exe20 {
    public static void main(String[] args) {
        
        int i = 500;
        int soma = 0;
        while(i >= 0){
            System.out.print(i + " ");
            soma = soma + i;
            i-=50;
        }
        System.out.println("\nSoma é: " + soma);
    }
}
