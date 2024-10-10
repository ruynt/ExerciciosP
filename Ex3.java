package Ex3;

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para o saque de R$" + valor + ".");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + ", Saldo atual: R$" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000.00);
        
        conta.exibirSaldo();
        
        conta.depositar(500.00);
        conta.exibirSaldo();
        
        conta.sacar(300.00);
        conta.exibirSaldo();
        
        conta.sacar(1500.00);
    }
}
