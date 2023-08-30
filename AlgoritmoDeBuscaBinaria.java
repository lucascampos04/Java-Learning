import java.util.Scanner;

public class AlgoritmoDeBuscaBinaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }

        System.out.println("Números digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Número : " + (i + 1) + ": " + array[i]);
        }

        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Números ordenados");
        for (int i = 0; i < 5; i++){
            System.out.println("Número " + (i + 1) + ": " + array[i]);
        }

        double mediana;
        if (array.length % 2 == 0){
            int meio1 = array.length / 2 - 1;
            int meio2 = array.length / 2;
            mediana = (array[meio1] + array[meio2]) / 2.0;
        } else {
            int meio = array.length / 2;
            mediana = array[meio];
        }

        System.out.println("Mediana: " + mediana);
    }
}
