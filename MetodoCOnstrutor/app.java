package MetodoCOnstrutor;

public class app {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Lucas oliveira", 18, 1.84f);
        pessoa.imprimirDados();


        Personagem perso = new Personagem("Lucas", "Estudante");
        perso.mostrarStatus();
    }
}
