public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4, 1, 31, 8, 6, 1, 9,12, 3};
        int auxiliar;
        boolean trocou;

        for (int i = 0; i < array.length - 1; i++) {
            trocou = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;
                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
