package Funcionario;

public class FuncionarioMensal extends Funcionario {
    private double salarioMensal;

    public FuncionarioMensal(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}
