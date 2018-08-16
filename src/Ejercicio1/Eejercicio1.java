
package Ejercicio1;

import java.util.Scanner;


public class Eejercicio1 {

    
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int n;
       int factorial=1;
       
        System.out.println("ingrese un numero");
        n=sc.nextInt();
       
        factorial=factrn(n);
        
        System.out.println("el factorial de "+n+" es: "+factorial);
        
        
    }
    
    public static int factrn(int n)
    {
        if(n==1)
            return 1;
        
        System.out.println(n+"+ factorial de "+(n-1)+"\n");
        
        return n*factrn(n-1);
    }
            
            
    
}
