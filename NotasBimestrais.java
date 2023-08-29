import java.util.Scanner;

public class NotasBimestrais {
    public static void main(String[] args) {
        float[] notas = new float[4];
        float media = 0;
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < 4; i++) {
            System.out.printf("Nota %d\n", i + 1);
            float nota = scan.nextFloat();
            notas[i] = nota;
            media += nota;
        }

        media /= 4;

        System.out.println("Notas inseridas: ");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Nota %d: %.1f\n", i + 1, notas[i]);
        }

        System.out.printf("Média: %.2f\n", media);

    }
}
