package Ex8;

import java.util.ArrayList;
import java.util.List;

class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }
}

class Empresa {
    private String nome;
    private List<Empregado> empregados;

    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void exibirEmpregados() {
        System.out.println("Empregados da empresa " + nome + ":");
        for (Empregado empregado : empregados) {
            empregado.exibirInformacoes();
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions");

        Empregado emp1 = new Empregado("Alice", "Desenvolvedora", 7000.00);
        Empregado emp2 = new Empregado("Bruno", "Analista de Sistemas", 6000.00);
        Empregado emp3 = new Empregado("Carlos", "Gerente de Projetos", 9000.00);

        empresa.adicionarEmpregado(emp1);
        empresa.adicionarEmpregado(emp2);
        empresa.adicionarEmpregado(emp3);

        empresa.exibirEmpregados();
    }
}
