package programa;

public class Cliente {

    private String nombre;
    private String cedula;
    private String correo;
    private String direccion;
    private String telefono;

    Cliente(String nombre, String cedula, String correo, String direccion,
            String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;

    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getcedula() {
        return cedula;
    }

    public void setcedula(String cedula) {
        this.cedula = cedula;
    }

    public String getcorreo() {
        return correo;

    }

    public void setcorreo(String correo) {
        this.correo = correo;

    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public String gettelefono() {
        return telefono;

    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
    }


}
