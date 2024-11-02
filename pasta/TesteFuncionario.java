package pasta;

public class TesteFuncionario {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("João", 1200, "Ser inutil");
        funcionario.setSalario(3000);
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.cargo);
        funcionario.cargo = "nada nada";
    }
    
}
