package tercero;

import java.util.Scanner;

public class valro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("nombre del producto");

        String nombre = input.next();

        System.out.println("el nombre del producto es: " + nombre);

        Scanner imput = new Scanner(System.in);

        System.out.println("cantidad del producto");

        int cantidad = imput.nextInt();

        System.out.println("la cantidad del producto es: " + cantidad);

        Scanner in = new Scanner(System.in);

        System.out.println("precio del producto");

        int precio = in.nextInt();

        System.out.println("el precio del producto es: " + precio);

        Scanner inn = new Scanner(System.in);

        

        int neto;

        neto = cantidad * precio;

        System.out.println("el valor neto es de: " + neto);
        
       
        
        int iva = (int) (neto * 0.19);
        
        System.out.println("el valor del iva es de: " + iva);

    }
}
