package Produtos;


public class TesteProduto {
    public static void main(String[] args) {
        ProdutoEletronico celular = new ProdutoEletronico("Celular", 2000.00);
        System.out.println("Produto: " + celular.nome);
        System.out.println("Preço original: R$" + celular.preco);
        System.out.println("Preço com desconto: R$" + celular.calcularPrecoFinal());

        ProdutoAlimenticio pao = new ProdutoAlimenticio("Pão", 5.00);
        System.out.println("\nProduto: " + pao.nome);
        System.out.println("Preço original: R$" + pao.preco);
        System.out.println("Preço com desconto: R$" + pao.calcularPrecoFinal());
    }
}
