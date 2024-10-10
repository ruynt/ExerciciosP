package Ex9;

interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    private String conteudo;

    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Relatório:");
        System.out.println(conteudo);
    }
}

class Contrato implements Imprimivel {
    private String termos;

    public Contrato(String termos) {
        this.termos = termos;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Contrato:");
        System.out.println(termos);
    }
}

public class Ex9 {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio("Relatório de Vendas do Mês.");
        Contrato contrato = new Contrato("Contrato de Prestação de Serviços.");

        relatorio.imprimir();
        contrato.imprimir();
    }
}
