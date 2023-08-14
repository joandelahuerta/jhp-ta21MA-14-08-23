import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {
		double cantidadEuros = Double.parseDouble(JOptionPane.showInputDialog("Introduce una cantidad en euros:"));
        String monedaDestino = JOptionPane.showInputDialog("En que quieres convertir tus euros? (dolares / yenes / libras):");

        convertirMoneda(cantidadEuros, monedaDestino);
    }

    public static void convertirMoneda(double euros, String monedaDestino) {
        double conversion;
        String mensajeMoneda;

        switch (monedaDestino.toLowerCase()) {
            case "dolares":
                conversion = euros * 1.28611;
                mensajeMoneda = "dolares";
                break;
            case "yenes":
                conversion = euros * 129.852;
                mensajeMoneda = "yenes";
                break;
            case "libras":
                conversion = euros * 0.86;
                mensajeMoneda = "libras";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Moneda no valida.");
                return;
        }

        JOptionPane.showMessageDialog(null, "Son " + conversion + " " + mensajeMoneda);
    }

}
