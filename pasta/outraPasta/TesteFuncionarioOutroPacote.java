package pasta.outraPasta;
import pasta.Funcionario;

public class TesteFuncionarioOutroPacote {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Maria", 1500, "nada");
        funcionario.nome = "Julia";
        funcionario.setSalario(3000);
        funcionario.getSalario();

        // funcionario.cargo nao pode ser acessado 

    }}