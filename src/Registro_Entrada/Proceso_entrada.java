
package Registro_Entrada;


import java.util.ArrayList;

public class Proceso_entrada {
 ArrayList<Util_Entrada> listaEntrada;
    
  public Proceso_entrada() {
      listaEntrada=new ArrayList<Util_Entrada>();
    }
 //****METODOS DEL ARRAYLIST******************************
public void agregarRegistro(Util_Entrada P){
    listaEntrada.add(P);
}  

public void modificarRegistro(int i,Util_Entrada P){
    listaEntrada.set(i, P);
}
  
public void eliminarRegistro(int i){
    listaEntrada.remove(i);
}

public int buscarCodigo(int id_entrada){
    int encontrado=-1; //el codigo no existe
    for(int i=0;i<listaEntrada.size();i++){
        if(id_entrada==listaEntrada.get(i).getId_entrada()){
            encontrado=i;
        }
    }
    return encontrado;
}

public Util_Entrada obtenerRegistro(int i){
    Util_Entrada pro=null;
    pro=listaEntrada.get(i);
    return pro;
}

public int cantidadRegistros(){
    return listaEntrada.size();
}
}
