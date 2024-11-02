package Veiculos;

public class Drone extends Veiculo implements Pilotavel {

    public Drone(int nivelBateria) {
        super(nivelBateria);
    }

    @Override
    public void pilotar() throws BateriaBaixaException {
        if (nivelBateria < 15) {
            throw new BateriaBaixaException("Bateria baixa! Nível de bateria: " + nivelBateria + "%");
        }
        System.out.println("Drone pilotado. Nível de bateria: " + nivelBateria + "%");
    }
}
