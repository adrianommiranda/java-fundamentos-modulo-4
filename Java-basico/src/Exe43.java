public class Exe43 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(num1 + " ");
            num1 = num1 + num2;
            num2 = num1 - num2;
        }

    }
}
