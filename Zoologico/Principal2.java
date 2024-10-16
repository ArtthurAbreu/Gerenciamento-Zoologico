package Zoologico;

import javax.swing.JOptionPane;

public class Principal2 {
    public static void main(String[] args) {
        // Fábrica de Mamíferos
        AnimalFactory mamiferoFactory = new MamiferoFactory();
        Animal mamifero = mamiferoFactory.createAnimal(70.5, 4, 5, "Leão", new Local(1), 101);
        
        // Exibir o nome do mamífero com uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mamifero.getNome(), "Informação do Mamífero", JOptionPane.INFORMATION_MESSAGE);

        // Exibir informações detalhadas no console
        mamifero.InfoAnimais();

        // Fábrica de Peixes
        AnimalFactory peixesFactory = new PeixesFactory();
        Animal peixe = peixesFactory.createAnimal(2.5, 0, 2, "Dourado", new Local(2), 102);
        
        // Exibir informações detalhadas do peixe no console
        peixe.InfoAnimais();
    }
}