package Zoologico;

public class Local {
    private int numeroJaula;

    public Local(int numeroJaula) {
        this.numeroJaula = numeroJaula;
    }

    public int getNumeroJaula() {
        return numeroJaula;
    }

    @Override
    public String toString() {
        return "Jaula número " + numeroJaula;
    }
}