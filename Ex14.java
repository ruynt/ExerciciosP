package Ex14;

class Configuracao {
    private static Configuracao instancia;
    
    private String valor;

    private Configuracao() {
        
        valor = "Configuração padrão";
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}

public class Ex14 {
    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstancia();
        System.out.println("Valor inicial: " + config1.getValor());

        config1.setValor("Nova configuração");
        
        Configuracao config2 = Configuracao.getInstancia();
        System.out.println("Valor obtido de config2: " + config2.getValor());

        System.out.println("São as mesmas instâncias? " + (config1 == config2));
    }
}

