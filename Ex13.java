package Ex13;

class Matematica {

    public static long fatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número deve ser não negativo.");
        }
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int numero = 5;
        long resultadoFatorial = Matematica.fatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultadoFatorial);

        numero = 0;
        resultadoFatorial = Matematica.fatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultadoFatorial);
    }
}
