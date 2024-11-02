package Funcionario;

public class FuncionarioHora extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioHora(String nome, double valorHora, int horasTrabalhadas) {
        super(nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}
