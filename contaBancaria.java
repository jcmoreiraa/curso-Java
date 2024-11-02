public class contaBancaria {
    public String numeroConta;
    private double saldo;

    public contaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    void depositar(int deposito){
        this.saldo = this.saldo +  deposito;

    }
    public double pegaSaldo() {
        return this.saldo;
    }

    void sacar(int sacado){
        this.saldo = this.saldo - sacado;
    }

    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria("contaDeJulio", 1000);
        System.out.print(conta.pegaSaldo() + " ");
        conta.depositar(100);
        conta.sacar(150);
        System.out.println(conta.pegaSaldo());
       
    }
}
