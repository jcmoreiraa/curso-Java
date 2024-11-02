
import java.text.DecimalFormat;


public class Produtos {
    public String nome;
    public double preco;
    public int quantidade;

    public Produtos(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;


    }

    double calcular_total(){
        return this.preco * this.quantidade;

    }
    public static void main(String[] args) {
        Produtos produto = new Produtos("Caderno", 15.00, 100);
        System.out.println("O produto é: " + produto.nome);
        System.out.println("A quantidade é:" + produto.quantidade);
        System.out.println("O preco é: " + produto.preco);

         double resultado = produto.calcular_total();
         System.out.println("o estoque é: " + String.format("%.1f", resultado));
    }
}
