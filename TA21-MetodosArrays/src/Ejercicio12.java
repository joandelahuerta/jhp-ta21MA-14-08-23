import javax.swing.JOptionPane;
import java.util.Random;

public class Ejercicio12 {

	public static void main(String[] args) {
		int tamano = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array:"));

        int[] array = generarArrayAleatorio(tamano);
        int digito = obtenerDigitoFiltro();

        int[] numerosFiltrados = filtrarNumerosPorDigito(array, digito);
        mostrarArrayFiltrado(numerosFiltrados, digito);
    }

    public static int[] generarArrayAleatorio(int tamano) {
        Random random = new Random();
        int[] array = new int[tamano];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(300) + 1;
        }
        return array;
    }

    public static int obtenerDigitoFiltro() {
        int digito;
        do {
            digito = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dígito que quieres (0-9):"));
        } while (digito < 0 || digito > 9);
        return digito;
    }

    public static int[] filtrarNumerosPorDigito(int[] array, int digito) {
        int[] numerosFiltrados = new int[array.length];
        int contador = 0;
        for (int numero : array) {
            if (numero % 10 == digito) {
                numerosFiltrados[contador] = numero;
                contador++;
            }
        }
        int[] resultado = new int[contador];
        System.arraycopy(numerosFiltrados, 0, resultado, 0, contador);
        return resultado;
    }

    public static void mostrarArrayFiltrado(int[] array, int digito) {
        if (array.length == 0) {
            JOptionPane.showMessageDialog(null, "No se encontraron números que terminen en " + digito);
            return;
        }

        StringBuilder mensaje = new StringBuilder("Números que terminan en " + digito + ":\n");
        for (int i = 0; i < array.length; i++) {
            mensaje.append("Posición ").append(i).append(": ").append(array[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

}
