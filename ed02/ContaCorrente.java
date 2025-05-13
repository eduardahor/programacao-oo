package ed02;

/**
 * Representa uma conta corrente que aplica 0.1% de juros ao dia.
 */
public class ContaCorrente extends Conta {

    /**
     * Cria uma nova conta corrente.
     * 
     * @param cliente Nome do cliente
     */
    public ContaCorrente(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.001;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}
