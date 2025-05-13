package ed02;

/**
 * Representa uma conta poupança que aplica 0.08% de juros ao dia.
 */
public class ContaPoupanca extends Conta {

    /**
     * Cria uma nova conta poupança.
     * 
     * @param cliente Nome do cliente
     */
    public ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }
}

