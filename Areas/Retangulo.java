package Areas;

public class Retangulo extends Forma{
    public double lado;
    public double altura;

    public Retangulo(double lado, double altura){
        this.lado = lado;

        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return lado*altura;
    }


}