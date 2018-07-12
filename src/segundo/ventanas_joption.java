   package segundo;

import javax.swing.JOptionPane;

public class ventanas_joption {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "HOLA MUNDO");
        int x1 = Integer.parseInt(JOptionPane.showInputDialog("Cuantos años tienes"));
        JOptionPane.showMessageDialog(null, x1 * 0);
    }
}
