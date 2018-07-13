package segundo;
import segundo.persona;

public class registrar_personas {
    
    public static void main(String[] args) {
        persona p1 = new persona("brayan", "1235046186", 18, "yekuc@kusd.com", "3214565243");
        
        System.out.println(p1.getNombre() + "\n" +  p1.getIdentificacion());
        
    }
}
