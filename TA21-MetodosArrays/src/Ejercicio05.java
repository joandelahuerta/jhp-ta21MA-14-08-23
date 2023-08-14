import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		int numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero:"));

        String numeroBinario = convertirDecimalABinario(numeroDecimal);

        JOptionPane.showMessageDialog(null, "Convertido a binario: " + numeroBinario);
    }

    public static String convertirDecimalABinario(int numero) {
        if (numero == 0) {
            return "0";
        }
        
        StringBuilder binario = new StringBuilder();
        while (numero > 0) {
            int residuo = numero % 2;
            binario.insert(0, residuo);
            numero /= 2;
        }
        
        return binario.toString();
    }

}
