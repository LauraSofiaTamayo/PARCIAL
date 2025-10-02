import java.util.ArrayList;
import java.util.Scanner;

public class ValidadorCamaleon {
    private ArrayList<Integer> numeros = new ArrayList<>();
    private ArrayList<Integer> camaleones = new ArrayList<>();

    public void solicitarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de números a validar: ");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
    }

    public void validarCamaleones() {
        for (int n : numeros) {
            NumeroCamaleon obj = new NumeroCamaleon(n);
            if (obj.esCamaleon()) {
                camaleones.add(n);
            }
        }
    }

    public void mostrarResultados() {
        System.out.println("\nNúmeros camaleón encontrados:");
        for (int c : camaleones) {
            System.out.println("- " + c);
        }
        System.out.println("Total: " + camaleones.size());
    }
}
