package ed02;

/**
 * Representa uma conta salário que não aplica juros diários.
 */
public class ContaSalario extends Conta {

    /**
     * Cria uma nova conta salário.
     * 
     * @param cliente Nome do cliente
     */
    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        // Conta salário não aplica juros
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Salário ===");
        super.imprimirExtrato();
    }
}

