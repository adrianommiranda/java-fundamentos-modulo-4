public class Exe16 {
    public static void main(String[] args) {
        
        int i = 30;
        
        while(i >=0 ){
            if(i % 4 ==0){
                System.out.printf(" [%d] ",i);
            }else{
                System.out.print( i + " " );
            }
            i--;
        }  
        System.out.println("\nAcabou!");

    }
}
