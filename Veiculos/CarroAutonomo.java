package Veiculos;

public class CarroAutonomo extends Veiculo implements Pilotavel, Recarregavel {

    public CarroAutonomo(int nivelBateria) {
        super(nivelBateria);
    }

    @Override
    public void pilotar() throws BateriaBaixaException {
        if (nivelBateria < 15) {
            throw new BateriaBaixaException("Bateria baixa! Nível de bateria: " + nivelBateria + "%");
        }
        System.out.println("Carro autônomo pilotado. Nível de bateria: " + nivelBateria + "%");
    }


    @Override
    public void recarregar(int quantidade) {
        nivelBateria = Math.min(nivelBateria + quantidade, 100); 
        System.out.println("Carro autônomo recarregado. Nível de bateria: " + nivelBateria + "%");
    }
}
