package POO.Polimorfismo;

public class Loja {
    public void memoriaRam(GeralCelular celular){
        celular.setMemoriaRam(8);
    }

    public static char memoria(Iphone iphone){
        iphone.setMemoria(128);
        System.out.println("+128gb de memoria");
        return 0;
    }

    public static int atualizarVersaoAndroid(Xiaomi xiaomi){
        xiaomi.setVersaoDosistemaOperacional(12);
        System.out.println("Versão do android atualizada");
        return 0;
    }
}
