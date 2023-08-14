import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero:"));

        int numeroCifras = contarCifras(numero);
        JOptionPane.showMessageDialog(null, "El numero de cifras es: " + numeroCifras);
    }



    public static int contarCifras(int numero) {
        if (numero == 0) {
            return 1;
        }
        int cifras = 0;
        while (numero > 0) {
            cifras++;
            numero /= 10;
        }
        return cifras;
    }

}
