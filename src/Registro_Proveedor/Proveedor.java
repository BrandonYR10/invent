
package Registro_Proveedor;

import Registro_Producto.*;

public class Proveedor {
    private int ruc;
    private String nombre;
    private String apellidos;
    private String categoria;
    //constructor
    public Proveedor() {
    }

    public Proveedor(int ruc, String nombre, String apellidos, String categoria) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.categoria = categoria;
    }

   
  //metodos getter y setter

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    
}
