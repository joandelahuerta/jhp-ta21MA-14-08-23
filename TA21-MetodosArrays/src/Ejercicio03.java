import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero:"));

        boolean esPrimo = esNumeroPrimo(numero);

        if (esPrimo) {
            JOptionPane.showMessageDialog(null, numero + " es un n�mero primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un n�mero primo.");
        }
    }

    public static boolean esNumeroPrimo(int numero) {
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

}
