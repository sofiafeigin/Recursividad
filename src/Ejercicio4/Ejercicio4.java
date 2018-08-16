package Ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        int num1,num2,resultado,i=0;
        
        System.out.println("ingrese el numero 1");
        num1=sc.nextInt();
        System.out.println("ingrese el numero 2");
        num2=sc.nextInt();
        
        resultado=dividir(num1,num2);
        
        System.out.println("el cociente de dividir "+num1+" por "+num2+" es= "+resultado);
        
    }
    
    public static int dividir(int num1,int num2)
    {
        if(num1-num2<0)
            return 0;
        
        return 1+dividir(num1-num2,num2);
        
        
    }
    
}
