/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenacion;

/**
 *
 * @author Sergio
 */
public class AlgoritmosOrdenacion {

    public static void main(String[] args) {
    int [] listaNumeros = {11,17,22,68};
  
    }
    
    public void ordenacionBurbuja( int [ ] numeros ){ 
        int aux=0;
        for(int j=0;j<numeros.length;j++){
         for(int i=0;i<numeros.length-1;i++){
             //Intercambiar los elementos
             if(numeros[i] >numeros[i +1]){
                 
                 aux=numeros[i];
                 
                 numeros[ i ] = numeros[ i+1 ];
                 
                   numeros[ i+1 ] = aux;         
                            
             }
         }
        }
        
    }
    
}
