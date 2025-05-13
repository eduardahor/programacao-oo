package ed02;


/**
 * Classe base que representa uma conta bancária genérica.
 */
public class Conta {
    /** Nome do cliente titular da conta. */
    protected String cliente;

    /** Saldo atual da conta. */
    protected double saldo;

    /**
     * Cria uma nova conta para um cliente com saldo inicial zero.
     * 
     * @param cliente Nome do cliente
     */
    public Conta(String cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    /**
     * Deposita um valor na conta.
     * 
     * @param valor Valor a ser depositado
     */
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    /**
     * Realiza um saque da conta.
     * 
     * @param valor Valor a ser sacado
     * @return true se o saque for bem-sucedido, false caso contrário
     */
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    /**
     * Transfere um valor desta conta para outra conta.
     * 
     * @param destino Conta de destino
     * @param valor Valor a ser transferido
     */
    public void transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
        }
    }

    /**
     * Retorna o saldo atual da conta.
     * 
     * @return Saldo da conta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Imprime o extrato da conta.
     */
    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$ " + saldo);
    }

    /**
     * Aplica juros diários ao saldo da conta.
     */
    public void aplicarJurosDiarios() {
    }
}
