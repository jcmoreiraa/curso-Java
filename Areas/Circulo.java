package Areas;

public class Circulo extends Forma {
        public double raio;

        public Circulo(double raio){
            this.raio = raio;

        }

        @Override
        public double calcularArea(){
            return(3.14*raio*raio);   
        }
        
    }
    

