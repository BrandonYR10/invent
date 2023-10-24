
package Registro_Salida;


import java.util.ArrayList;

public class Proceso_salida {
 ArrayList<Util_Salida> listaEntrada;
    
  public Proceso_salida() {
      listaEntrada=new ArrayList<Util_Salida>();
    }
 //****METODOS DEL ARRAYLIST******************************
public void agregarRegistro(Util_Salida P){
    listaEntrada.add(P);
}  

public void modificarRegistro(int i,Util_Salida P){
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

public Util_Salida obtenerRegistro(int i){
    Util_Salida pro=null;
    pro=listaEntrada.get(i);
    return pro;
}

public int cantidadRegistros(){
    return listaEntrada.size();
}
}
