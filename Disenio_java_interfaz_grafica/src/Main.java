import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        // ingreso los valores por terminal grafica
        String primerNUmero = JOptionPane.showInputDialog("Ingrese el priemr numero");
        String segundoNUmero = JOptionPane.showInputDialog("Ingrese el segundo numero");

        int numero1= Integer.parseInt(primerNUmero);  // convierte las entrads de string a valores en int
        int numero2= Integer.parseInt(segundoNUmero);
        int suma = numero1+numero2;  // realiza la operacion
        // mostrar los resultados
        JOptionPane.showMessageDialog(null, "la suma de los numeros es: "+suma,
                "Suma de dos valores", JOptionPane.PLAIN_MESSAGE);
    }
}