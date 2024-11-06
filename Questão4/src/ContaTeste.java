public class ContaTeste {
    public static void main(String[] args) {
        // Criando uma conta corrente com saldo de R$1000, status "Não especial" e limite de R$200
        ContaCorrente conta1 = new ContaCorrente("12345", 1000, false, 200);
        
        // Exibe saldo atual
        conta1.consultarSaldo();
        
        // Tentando realizar um saque de R$1200 (saque permitido pois saldo + limite = 1000 + 200 = 1200)
        System.out.println("\nTentando realizar um saque de R$1200:");
        conta1.realizarSaque(1200);  // Saque permitido
        
        // Realizando um depósito de R$500
        System.out.println("\nRealizando um depósito de R$500:");
        conta1.depositar(500); // Depósito realizado
        
        // Verificando se a conta está utilizando cheque especial
        System.out.println("\nVerificando se está usando cheque especial:");
        conta1.verificarChequeEspecial();  // Conta não usa cheque especial
        
        // Tentando realizar um saque de R$2000 (saque não permitido devido ao saldo insuficiente)
        System.out.println("\nTentando realizar um saque de R$2000:");
        conta1.realizarSaque(2000);  // Saque negado por saldo insuficiente
        
        // Exibe saldo final
        conta1.consultarSaldo();
    }
}
