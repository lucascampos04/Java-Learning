package Logica;

public class For {
    public static void main(String[] args){
        int n = 0;

        for (n=1; n <= 10; n+=2){
            for (int m=1; m <=100; m++){
                System.out.println(":" + m);
            }
                System.out.println(": " + n);
        }
    }
}
