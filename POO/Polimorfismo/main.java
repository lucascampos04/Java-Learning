package POO.Polimorfismo;

public class main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("ios", 12, 6, 256);
        Samsung samsung = new Samsung("Android", 12, 8, 126);
        Motorola motorola = new Motorola("Android", 12, 8, 126);
        Xiaomi xiaomi = new Xiaomi("Android", 12, 8, 126);

        xiaomi.ligar();
        motorola.ligar();
        iphone.ligar();
        samsung.ligar();

        System.out.println("");

        Loja.memoria(iphone);{
            System.out.println(Loja.memoria(iphone));
        }

        System.out.println("");

        Loja.atualizarVersaoAndroid(xiaomi);{
            System.out.println(Loja.atualizarVersaoAndroid(xiaomi));
        }

    }
}
