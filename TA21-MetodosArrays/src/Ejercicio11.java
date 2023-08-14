import javax.swing.JOptionPane;
import java.util.Random;

public class Ejercicio11 {

	public static void main(String[] args) {
		int tamano = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de los arrays:"));

        int[] array1 = new int[tamano];
        int[] array2 = array1.clone();

        rellenarArrayAleatorio(array1);
        rellenarArrayAleatorio(array2);

        int[] resultado = multiplicarArrays(array1, array2);

        mostrarArray("Contenido del primer array:", array1);
        mostrarArray("Contenido del segundo array:", array2);
        mostrarArray("Resultado de la multiplicación:", resultado);
    }

    public static void rellenarArrayAleatorio(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10); // Números aleatorios entre 0 y 9
        }
    }

    public static int[] multiplicarArrays(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] * array2[i];
        }
        return resultado;
    }

    public static void mostrarArray(String mensaje, int[] array) {
        StringBuilder mensajeArray = new StringBuilder(mensaje + "\n");
        for (int i = 0; i < array.length; i++) {
            mensajeArray.append("Posición ").append(i).append(": ").append(array[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensajeArray.toString());
    }

}
