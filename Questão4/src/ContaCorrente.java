public class ContaCorrente {
    // Atributos
    private String numero;   // Número da conta
    private double saldo;    // Saldo da conta
    private boolean statusEspecial; // Indica se a conta é especial ou não
    private double limite;   // Limite de cheque especial

    // Construtor
    public ContaCorrente(String numero, double saldo, boolean statusEspecial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.statusEspecial = statusEspecial;
        this.limite = limite;
    }

    // Métodos getters e setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatusEspecial() {
        return statusEspecial;
    }

    public void setStatusEspecial(boolean statusEspecial) {
        this.statusEspecial = statusEspecial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Método para realizar o saque
    public void realizarSaque(double valor) {
        // Verifica se o saque pode ser realizado
        if (valor > saldo + limite) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            System.out.println("Saldo atual: R$" + saldo);
        }
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            System.out.println("Saldo atual: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para consultar saldo
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    // Método para verificar se a conta está utilizando cheque especial
    public void verificarChequeEspecial() {
        if (statusEspecial) {
            System.out.println("Você está utilizando cheque especial.");
        } else {
            System.out.println("Você não está utilizando cheque especial.");
        }
    }
}
