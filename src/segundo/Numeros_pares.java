package segundo;

import javax.swing.JOptionPane;

public class Numeros_pares {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese primer numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese segundo numero"));

        System.out.println(n + " " + n2);
        int suma = n + n2;

        if (suma % 2 == 0) {
            String tex = "el numero es par";
            JOptionPane.showMessageDialog(null, tex);
        } else {
            String tex = "el numero no es par";
            JOptionPane.showMessageDialog(null, tex);
        }

    }

}
