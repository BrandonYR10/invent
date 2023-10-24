
package Registro_Producto;

import java.util.ArrayList;

public class Proceso {
 ArrayList<Producto> listaProductos;
    
  public Proceso() {
      listaProductos=new ArrayList<Producto>();
    }
 //****METODOS DEL ARRAYLIST******************************
public void agregarRegistro(Producto P){
    listaProductos.add(P);
}  

public void modificarRegistro(int i,Producto P){
    listaProductos.set(i, P);
}
  
public void eliminarRegistro(int i){
    listaProductos.remove(i);
}

public int buscarCodigo(int codigo){
    int encontrado=-1; //el codigo no existe
    for(int i=0;i<listaProductos.size();i++){
        if(codigo==listaProductos.get(i).getCodigo()){
            encontrado=i;
        }
    }
    return encontrado;
}

public Producto obtenerRegistro(int i){
    Producto pro=null;
    pro=listaProductos.get(i);
    return pro;
}

public int cantidadRegistros(){
    return listaProductos.size();
}
}
