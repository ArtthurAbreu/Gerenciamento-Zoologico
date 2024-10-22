package Zoologico;

public class ReptilAdapter extends Animal {
    private Reptil reptil;

    public ReptilAdapter(Reptil reptil) {
        super(reptil.getPesoReptil(), 0, 0, reptil.getNomeReptil(), new Local(0), 0);  // Adaptar valores padrão
        this.reptil = reptil;
    }

    @Override
    public void InfoAnimais() {
        reptil.exibirInformacoes();
    }

    // Pode sobrepor os métodos conforme necessário para adaptar o comportamento do Reptil
    @Override
    public double getPeso() {
        return reptil.getPesoReptil();
    }

    @Override
    public String getNome() {
        return reptil.getNomeReptil();
    }

    @Override
    public int getMembros() {
        return 0; // Supondo que a cobra não tem membros
    }

    @Override
    public int getIdade() {
        return 0; // Valor padrão ou adaptado
    }

    @Override
    public Local getJaula() {
        return new Local(0); // Valor padrão ou adaptado
    }

    @Override
    public int getIdAnimal() {
        return 0; // Valor padrão ou adaptado
    }
}
