package Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];

        funcionarios[0] = new FuncionarioHora("Carlos", 50.0, 160); 
        funcionarios[1] = new FuncionarioMensal("Ana", 3000.0);      

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("Salário: R$ " + funcionario.calcularSalario());
            System.out.println("---------------");
        }
    }
}
