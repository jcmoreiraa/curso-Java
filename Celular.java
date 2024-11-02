public class Celular {
    @SuppressWarnings("unused")
    private String marca;
    @SuppressWarnings("unused")
    private String modelo;
    private int nivelBateria; 

    public Celular(String marca, String modelo, int nivelBateria) {
        this.marca = marca;
        this.modelo = modelo;
        if (nivelBateria < 0) {
            this.nivelBateria = 0;
        } else if (nivelBateria > 100) {
            this.nivelBateria = 100;
        } else {
            this.nivelBateria = nivelBateria;
        }
    }

    public void usarCelular() {
        if (nivelBateria > 0) {
            nivelBateria -= 10;
            if (nivelBateria < 0) {
                nivelBateria = 0;
            }
            System.out.println("Usando o celular. Nível da bateria: " + nivelBateria + "%");
            if (nivelBateria == 0) {
                System.out.println("A bateria está zerada. Por favor, carregue o celular.");
            }
        } else {
            System.out.println("Não é possível usar o celular. A bateria está zerada.");
        }
    }

    public void carregarCelular() {
        if (nivelBateria < 100) {
            nivelBateria += 10;
            if (nivelBateria > 100) {
                nivelBateria = 100;
            }
            System.out.println("Carregando o celular. Nível da bateria: " + nivelBateria + "%");
        } else {
            System.out.println("A bateria já está cheia.");
        }
    }

   

    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", "Galaxy S21", 50);
        celular.usarCelular(); 
        celular.usarCelular(); 
        celular.carregarCelular(); 
        celular.carregarCelular(); 
        celular.carregarCelular(); 
    }
}
