package programa;

import programa.Cliente;

public class Valor {

    public static void main(String[] args) {

        Cliente p1 = new Cliente("brayan", "123456870", "notengo@gmail.com", "olaya","313642639");

        System.out.println("EL NOMBRE DEL CLIENTE ES: "+p1.getnombre() + "\n" +"EL CORREO DEL CLIENTE ES; "+ p1.getcorreo() +
                "\n" +"LA CEDULA DEL CLIENTE ES: "+ p1.getcedula()+ "\n"+"LA DIRECCION DEL CLIENTE ES: "+ p1.getdireccion()
                +"\n"+"EL TELEFONO DEL CLIENTE ES: "+p1.gettelefono()
    

);
    }
}
