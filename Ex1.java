package aa;

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0; 
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidade += incremento;
            System.out.println("Acelerando: " + incremento + " km/h");
        } else {
            System.out.println("Incremento deve ser positivo.");
        }
    }

    public void frear(int decremento) {
        if (decremento > 0) {
            velocidade -= decremento;
            if (velocidade < 0) {
                velocidade = 0;
            }
            System.out.println("Freando: " + decremento + " km/h");
        } else {
            System.out.println("Decremento deve ser positivo.");
        }
    }

    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        carro1.exibirDetalhes();
        carro1.acelerar(50);
        carro1.exibirVelocidade();
        carro1.frear(20);
        carro1.exibirVelocidade();
        carro1.frear(40); 
        carro1.exibirVelocidade();
    }
}
