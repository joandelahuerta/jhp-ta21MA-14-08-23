import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para calcular su factorial:"));

        long factorial = calcularFactorial(numero);

        JOptionPane.showMessageDialog(null, "Factorial de " + numero + " es: " + factorial);
    }

    public static long calcularFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El numero no puede ser negativo.");
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

}
