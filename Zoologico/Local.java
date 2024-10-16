package Zoologico;

public class Local {
    private int numeroJaula;

    public Local(int numeroJaula) {
        this.numeroJaula = numeroJaula;
    }

    @Override
    public String toString() {
        return "Jaula número " + numeroJaula;
    }
}