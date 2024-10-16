package Zoologico;

public class MamiferoFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(double peso, int membros, int idade, String nome, Local jaula, int idAnimal) {
        return new Mamifero(peso, membros, idade, nome, jaula, idAnimal, "marrom", 9);
    }
}