package Animais;


public class Cachorro extends Animal{

    public String tipo;
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
   
   
    @Override
    public void fazerSom(){
        System.out.println("AUAUAUAUAU");
    }
}