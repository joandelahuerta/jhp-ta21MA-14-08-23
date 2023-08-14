import javax.swing.JOptionPane;
import java.util.Random;

public class Ejercicio09 {

	public static void main(String[] args) {
		int tamano = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array:"));

        int[] array = new int[tamano];
        rellenarArray(array, 0, 9);
        mostrarArrayYSuma(array);
    }

    public static void rellenarArray(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static void mostrarArrayYSuma(int[] array) {
        int suma = 0;
        StringBuilder mensaje = new StringBuilder("Valores del array:\n");
        for (int i = 0; i < array.length; i++) {
            mensaje.append("Posición ").append(i).append(": ").append(array[i]).append("\n");
            suma += array[i];
        }
        mensaje.append("Suma de los valores: ").append(suma);
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

}
