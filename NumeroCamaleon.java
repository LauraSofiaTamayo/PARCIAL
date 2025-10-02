public class NumeroCamaleon {
    private int valor;

    public NumeroCamaleon(int valor) {
        this.valor = valor;
    }

    public int sumaDigitos() {
        int suma = 0, temp = valor;
        while (temp > 0) {
            suma += temp % 10;
            temp /= 10;
        }
        return suma;
    }

    public int invertido() {
        int invertido = 0, temp = valor;
        while (temp > 0) {
            invertido = invertido * 10 + temp % 10;
            temp /= 10;
        }
        return invertido;
    }

    public boolean esCamaleon() {
        return sumaDigitos() % 2 == 0 && invertido() > valor;
    }

    public int getValor() {
        return valor;
    }
}
