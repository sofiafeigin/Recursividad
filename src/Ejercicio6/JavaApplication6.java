
package Ejercicio6;

import java.util.Scanner;


public class JavaApplication6 {

 
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        int numero;
        int i=0,resultado;
        
        System.out.println("ingrese el numero");
        numero=sc.nextInt();
        
        resultado=cantidadUnos(numero);
        
        if(numero%2==0)
            System.out.println("la cantidad de unos es "+resultado);
        
        else
            System.out.println("la cantidad de unos es "+resultado);
        
    }
    
    public static int cantidadUnos(int numero)
    {
        if(numero<2)
            return numero;
        
        if(numero%2==1)
            return 1+cantidadUnos(numero/2);
        else
            return 0+cantidadUnos(numero/2);
    }
            
    
}
