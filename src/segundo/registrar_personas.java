/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo;
import segundo.persona;
/**
 *
 * @author braya
 */
public class registrar_personas {
    
    public static void main(String[] args) {
        persona p1 = new persona("brayan", "1235046186", 18, "yekuc@kusd.com", "3214565243");
        
        System.out.println(p1.getNombre() + "\n" +  p1.getIdentificacion());
        
    }
}
