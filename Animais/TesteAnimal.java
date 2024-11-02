package Animais;


public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("jao", 4);

        cachorro.nome = "Rex";
        cachorro.idade = 5;  
        cachorro.tipo = "Pastor Alemão";

        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade);
        System.out.println("Tipo: " + cachorro.tipo);

        cachorro.fazerSom();
    }
}
