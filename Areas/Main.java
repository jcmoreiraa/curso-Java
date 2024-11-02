package Areas;

public class Main {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(10, 10);
        Circulo circulo = new Circulo(5);

        System.out.println(retangulo.calcularArea());    
        System.out.println(circulo.calcularArea());    
    }
    
}
