
package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    
    public static void main(String[] args) {
       
       Scanner sc=new Scanner(System.in);
       
       int num1,num2,resultado;
       
        System.out.println("ingrese el numero 1");
        num1=sc.nextInt();
        System.out.println("ingrese el numero 2");
        num2=sc.nextInt();
       
       resultado=multiplicar(num1,num2);
       
        System.out.println("el resultado de "+num1+"x"+num2+" es= "+resultado);
    }
    
    public static int multiplicar(int num1,int num2)
    {
        if(num2==1)
            return num1;
        
        return num1+multiplicar(num1,num2-1);
        
    }   
    
}
