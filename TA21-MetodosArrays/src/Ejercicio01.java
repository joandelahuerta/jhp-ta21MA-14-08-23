import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		String figura = JOptionPane.showInputDialog("Quieres calcular un circulo, un cuadrado o un triangulo?");
        
        switch (figura.toLowerCase()) {
            case "circulo":
                double radio = pedirValor("radio");
                double areaCirculo = Math.PI * radio * radio;
                JOptionPane.showMessageDialog(null, "El �rea del c�rculo es: " + areaCirculo);
                break;
            case "cuadrado":
                double lado = pedirValor("lado");
                double areaCuadrado = lado * lado;
                JOptionPane.showMessageDialog(null, "El �rea del cuadrado es: " + areaCuadrado);
                break;
            case "triangulo":
                double base = pedirValor("base");
                double altura = pedirValor("altura");
                double areaTriangulo = (base * altura) / 2;
                JOptionPane.showMessageDialog(null, "El �rea del tri�ngulo es: " + areaTriangulo);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Figura no reconocida. Por favor, introduce 'c�rculo', 'cuadrado' o 'tri�ngulo'.");
        }
    }
    public static double pedirValor(String nombreValor) {
        String input = JOptionPane.showInputDialog("Introduce el valor del " + nombreValor + ":");
        return Double.parseDouble(input);
    }
}