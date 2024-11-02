class Funcionario {
    public double calcularSalario() {
        return 0.0;
    }
}

class FuncionarioHora extends Funcionario {
    public double horasTrabalhadas;
    public double valorPorHora;

    public FuncionarioHora(double horasTrabalhadas, double valorPorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }
}

class FuncionarioMensal extends Funcionario {
    public double salarioMensal;

    public FuncionarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}

public class Funcionarios {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];

        funcionarios[0] = new FuncionarioHora(160, 50); 
        funcionarios[1] = new FuncionarioMensal(5000);  

        for (var f : funcionarios) {
            System.out.println("Salário: R$" + f.calcularSalario());
        }
    }
}
