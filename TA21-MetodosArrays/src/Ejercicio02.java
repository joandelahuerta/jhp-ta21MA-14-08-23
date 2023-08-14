import javax.swing.JOptionPane;
import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros aleatorios quieres?"));
        int minimo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor mínimo que quieres:"));
        int maximo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor máximo que quieres:"));

        StringBuilder resultados = new StringBuilder();
        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = generarNumeroAleatorio(minimo, maximo);
            resultados.append("----- ").append(numeroAleatorio).append(" ----- \n");
        }

        JOptionPane.showMessageDialog(null, resultados.toString());
    }

    public static int generarNumeroAleatorio(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt(maximo - minimo + 1) + minimo;
    }

}
