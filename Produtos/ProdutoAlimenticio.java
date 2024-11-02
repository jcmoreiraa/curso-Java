package Produtos;

public class ProdutoAlimenticio extends Produto {
    public ProdutoAlimenticio(String nome, double preco) {
        super(nome, preco);  
    }

    @Override
    public double calcularPrecoFinal() {
        return this.preco * 0.95; 
    }
}
