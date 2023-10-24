
package Registro_Entrada;




public class Util_Entrada {
    private int id_entrada;
    private String producto;
    private int stock;
    private String fecha;
    
    //constructor
    public Util_Entrada() {
    }

    public Util_Entrada(int id_entrada, String producto, int stock, String fecha) {
        this.id_entrada = id_entrada;
        this.producto = producto;
        this.stock = stock;
        this.fecha = fecha;
    }

    
    

   


  //metodos getter y setter

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    
    
}
