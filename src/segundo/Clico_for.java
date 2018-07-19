package segundo;

import javax.swing.JOptionPane;

public class Clico_for {

    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog("Que tabla desea?"));

        for (int i = 0; i <= 10; i = i + 1) {

            int mul = x * i;

            System.out.println(x + " x " + i + " = " + mul);

        }

    }

}
