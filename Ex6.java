package Ex6;

class Motor {
    private String tipo; 
    private int potencia; 

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void exibirInformacoes() {
        System.out.println("Motor tipo: " + tipo + ", Potência: " + potencia + " cv");
    }
}

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private Motor motor;

    public Carro(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
        motor.exibirInformacoes(); 
    }

    public static void main(String[] args) {
        Motor motor1 = new Motor("Gasolina", 150);
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, motor1);

        Motor motor2 = new Motor("Elétrico", 200);
        Carro carro2 = new Carro("Tesla", "Model 3", 2022, motor2);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}
