package Algoritmos;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12, 23, 45, 21, 43, 10, 4};

        System.out.println("Array antes");
        printArray(array);

        bubleSort(array);

        System.out.println("Array depois");
        printArray(array);
    }

    static void bubleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    static void printArray(int[] arr){
        for (int value : arr){
            System.out.println(value + "");
        }
        System.out.println();
    }
}
