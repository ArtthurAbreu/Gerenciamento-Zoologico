package Zoologico;

public class Reptil {
    private String nome;
    private double peso;

    public Reptil(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNomeReptil() {
        return this.nome;
    }

    public double getPesoReptil() {
        return this.peso;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do réptil: " + nome);
        System.out.println("Peso do réptil: " + peso + "kg");
    }
}
