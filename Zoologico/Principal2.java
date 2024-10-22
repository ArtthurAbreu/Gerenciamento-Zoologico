package Zoologico;

import javax.swing.JOptionPane;

public class Principal2 {
    public static void main(String[] args) {
        // Fábrica de Mamíferos
        AnimalFactory mamiferoFactory = new MamiferoFactory();
        Animal mamifero = mamiferoFactory.createAnimal(70.5, 4, 5, "Leão", new Local(1), 101);
        JOptionPane.showMessageDialog(null, mamifero.getNome(), "Informação do Mamífero", JOptionPane.INFORMATION_MESSAGE);

        // Utilizando o Adapter para um Reptil
        Reptil reptil = new Reptil("Cobra", 15.0);
        Animal reptilAdapter = new ReptilAdapter(reptil);

        JOptionPane.showMessageDialog(null, reptilAdapter.getNome(), "Informação do Réptil", JOptionPane.INFORMATION_MESSAGE);
        reptilAdapter.InfoAnimais();
    }
}
