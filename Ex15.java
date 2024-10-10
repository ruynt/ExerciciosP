package Ex15;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque de R$ " + valor);
        }
        saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}

public class Ex15 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Alice", 1000.0);
        
        try {
            conta.sacar(200.0);
            System.out.println("Saldo atual: R$ " + conta.getSaldo());

            conta.sacar(900.0); 
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
