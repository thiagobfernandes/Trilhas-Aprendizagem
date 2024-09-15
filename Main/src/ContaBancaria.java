public class ContaBancaria {

    private String numeroConta;
    private String nomeCliente;
    private double saldo;

    // Construtor
    public ContaBancaria(String numeroConta, String nomeCliente, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser positivo.");
        }
    }


    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
            } else {
                System.out.println("Saldo insuficiente para o saque de R$ " + valor);
            }
        } else {
            System.out.println("Valor de saque inválido. O valor deve ser positivo.");
        }
    }

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo Atual: R$ " + saldo);
    }

}
