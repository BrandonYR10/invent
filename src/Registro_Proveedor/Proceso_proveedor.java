
package Registro_Proveedor;

import java.util.ArrayList;

public class Proceso_proveedor {
 ArrayList<Proveedor> listaProveedor;
    
  public Proceso_proveedor() {
      listaProveedor=new ArrayList<Proveedor>();
    }
 //****METODOS DEL ARRAYLIST******************************
public void agregarRegistro(Proveedor P){
    listaProveedor.add(P);
}  

public void modificarRegistro(int i,Proveedor P){
    listaProveedor.set(i, P);
}
  
public void eliminarRegistro(int i){
    listaProveedor.remove(i);
}

public int buscarCodigo(int ruc){
    int encontrado=-1; //el codigo no existe
    for(int i=0;i<listaProveedor.size();i++){
        if(ruc==listaProveedor.get(i).getRuc()){
            encontrado=i;
        }
    }
    return encontrado;
}

public Proveedor obtenerRegistro(int i){
    Proveedor pro=null;
    pro=listaProveedor.get(i);
    return pro;
}

public int cantidadRegistros(){
    return listaProveedor.size();
}
}
