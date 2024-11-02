package Veiculos;

public abstract class Veiculo {
    protected int nivelBateria;

    public Veiculo(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }
}
