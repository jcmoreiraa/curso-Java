package Produtos;

public class ProdutoEletronico extends Produto {
    public ProdutoEletronico(String nome, double preco) {
        super(nome, preco); 
    }

    @Override
    public double calcularPrecoFinal() {
        return this.preco * 0.90;  
    }
}
