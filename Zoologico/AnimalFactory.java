package Zoologico;

public interface AnimalFactory {
    Animal createAnimal(double peso, int membros, int idade, String nome, Local jaula, int idAnimal);
}
