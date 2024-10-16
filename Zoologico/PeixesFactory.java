package Zoologico;

public class PeixesFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(double peso, int membros, int idade, String nome, Local jaula, int idAnimal) {
        return new Peixes(peso, membros, idade, nome, jaula, idAnimal, "prateada");
    }
}