import javax.swing.JOptionPane;
import java.util.Random;

public class Ejercicio10 {

	public static void main(String[] args) {
		int tamano = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array:"));
        int min = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor mínimo:"));
        int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor máximo:"));

        int[] array = generarArrayPrimos(tamano, min, max);
        mostrarArray(array);

        int maximoPrimo = encontrarMaximo(array);
        JOptionPane.showMessageDialog(null, "El número primo más grande es: " + maximoPrimo);
    }

    public static int[] generarArrayPrimos(int tamano, int min, int max) {
        Random random = new Random();
        int[] array = new int[tamano];
        int contador = 0;

        while (contador < tamano) {
            int numeroAleatorio = random.nextInt(max - min + 1) + min;
            if (esPrimo(numeroAleatorio)) {
                array[contador] = numeroAleatorio;
                contador++;
            }
        }

        return array;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void mostrarArray(int[] array) {
        StringBuilder mensaje = new StringBuilder("Valores del array:\n");
        for (int i = 0; i < array.length; i++) {
            mensaje.append("----- ").append(array[i]).append(" ----- \n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    public static int encontrarMaximo(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

}
