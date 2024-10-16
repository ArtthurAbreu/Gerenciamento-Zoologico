package Zoologico;

public abstract class Animal {
    private double peso;
    private int membros;
    private int idade;
    private String nome;
    private Local jaula;
    private int idAnimal;

    public Animal(double peso, int membros, int idade, String nome, Local jaula, int idAnimal) {
        this.peso = peso;
        this.membros = membros;
        this.idade = idade;
        this.nome = nome;
        this.jaula = jaula;
        this.idAnimal = idAnimal;
    }

    // Getters e Setters
    public double getPeso() { return peso; }
    public int getMembros() { return membros; }
    public int getIdade() { return idade; }
    public String getNome() { return nome; }
    public Local getJaula() { return jaula; }
    public int getIdAnimal() { return idAnimal; }

    public abstract void InfoAnimais();
}
