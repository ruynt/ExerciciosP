package Ex10;

class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double somar(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        double soma2 = calculadora.somar(5.0, 3.0);
        double soma3 = calculadora.somar(5.0, 3.0, 2.0);
        
        System.out.println("Soma de 5.0 e 3.0: " + soma2);
        System.out.println("Soma de 5.0, 3.0 e 2.0: " + soma3);
    }
}
