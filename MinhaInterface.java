import javax.swing.*;

public class MinhaInterface {
    public static void main(String[] args) {
        // Cria uma janela JFrame
        JFrame janela = new JFrame("Minha Interface");
        
        // Define o tamanho da janela
        janela.setSize(400, 300);
        
        // Define a ação ao fechar a janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Cria um rótulo para exibir texto
        JLabel rotulo = new JLabel("Olá, Mundo!");
        
        // Adiciona o rótulo à janela
        janela.add(rotulo);
        
        // Exibe a janela
        janela.setVisible(true);
    }
}
