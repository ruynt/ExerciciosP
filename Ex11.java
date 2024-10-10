package Ex11;

abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}

class FuncionarioHorista extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, double valorHora, int horasTrabalhadas) {
        super(nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}

class FuncionarioAssalariado extends Funcionario {
    private double salarioMensal;

    public FuncionarioAssalariado(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}

public class Ex11 {
    public static void main(String[] args) {
        Funcionario horista = new FuncionarioHorista("Alice", 20.0, 160);
        Funcionario assalariado = new FuncionarioAssalariado("Bruno", 5000.0);

        System.out.println("Salário de " + horista.nome + ": R$ " + horista.calcularSalario());
        System.out.println("Salário de " + assalariado.nome + ": R$ " + assalariado.calcularSalario());
    }
}
