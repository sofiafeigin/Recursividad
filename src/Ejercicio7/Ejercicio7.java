

package Ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {

    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        String numero;
        int i=0;
        
        System.out.println("ingrese el numero");
        numero=sc.next();
        
        mostrar(numero,i);
        
    }
    
    public static void mostrar(String numero,int i)
    {
        if(i==numero.length())
            return;
            
            System.out.print(numero.charAt(i)+"\t");
       
        mostrar(numero,i+1);
    }
    
}
