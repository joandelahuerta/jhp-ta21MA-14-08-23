import javax.swing.JOptionPane;

public class Ejercicio08 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
        rellenarValores(numeros);
        mostrarValores(numeros);
    }

    public static void rellenarValores(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero " + i + ":"));
            array[i] = valor;
        }
    }

    public static void mostrarValores(int[] array) {
        StringBuilder mensaje = new StringBuilder("Valores ingresados:\n");
        for (int i = 0; i < array.length; i++) {
            mensaje.append("Índice: ").append(i).append(", Valor: ").append(array[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

}
