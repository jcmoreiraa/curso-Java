public class ContaCorrente {
    private String numeroConta;
    private double saldo;

    public ContaCorrente(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaCorrente(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public ContaCorrente() {
        this.numeroConta = "0000";
        this.saldo = 0.0;
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        ContaCorrente conta1 = new ContaCorrente("12345", 500.0);
        ContaCorrente conta2 = new ContaCorrente("67890");
        ContaCorrente conta3 = new ContaCorrente();
    }
}
