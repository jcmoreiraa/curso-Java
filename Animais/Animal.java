package Animais;

public class Animal {
    public String nome;
    protected static int idade;

    public Animal(String nome, int idade)
    { this.nome = nome;
        this.idade = idade;
        

    }
    public void fazerSom() {
        System.out.println("Som genérico de um animal.");
    }
    

 
    
    

    
}


