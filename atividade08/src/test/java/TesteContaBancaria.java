public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        try {
            conta.depositar(500.0);
            conta.sacar(700.0);
            conta.sacar(2000.0); // Este saque irá lançar uma exceção
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
