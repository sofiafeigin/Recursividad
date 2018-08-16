
package Ejercicio5;


public class Ejercicio5 {

   
    public static void main(String[] args) {
        
        int []datos={1,2,3,4,5};
        
        mostrar(datos,5);
        
    }
    
    public static void mostrar(int[]datos,int tam)
    {
        if(tam==0)
            return;
        
        System.out.println(datos[tam-1]);
        
        mostrar(datos,tam-1);
    }
    
}
