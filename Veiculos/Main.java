package Veiculos;

public class Main {
    public static void main(String[] args) {
        CarroAutonomo carro = new CarroAutonomo(10);  
        Drone drone = new Drone(20);                  

        try {
            carro.pilotar();
        } catch (BateriaBaixaException error) {
            System.out.println(error.getMessage());
        }

        carro.recarregar(30);
        
        try {
            carro.pilotar();
        } catch (BateriaBaixaException error) {
            System.out.println(error.getMessage());
        }

        try {
            drone.pilotar();
        } catch (BateriaBaixaException error) {
            System.out.println(error.getMessage());
        }
    }
}
