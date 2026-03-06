package AlmacenRestaurante;

import java.util.ArrayList;

public class proveedor {
    private String nombre;
    private String telefono;
    private String direccion;

    public proveedor(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public void mostrarDatosProveedor() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Direccion: " + direccion);
    }

    @Override
    public String toString() {
        return "proveedor{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
