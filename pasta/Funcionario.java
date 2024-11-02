package pasta;

public class Funcionario {
    public String nome;
    private double salario;
    protected String cargo;


    public Funcionario(String nome, double salario, String cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }


    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double novoSalario){
        this.salario = novoSalario;
    }
    
}
