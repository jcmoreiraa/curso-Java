public class Aluno {
    public String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;

    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2)/2;

    }
    public String verificarAprovacao(double media){
        if (media >= 6.0){
            return "Aprovado";

        }
        return "Reprovado";
    }

 
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Julio", 7.0, 6.5);
        System.out.println(aluno.calcularMedia());
        String resultado = aluno.verificarAprovacao(aluno.calcularMedia());
        System.out.print(resultado);
    }
}
