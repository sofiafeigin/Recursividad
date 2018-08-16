package Ejercicio2;

import java.util.Scanner;


public class JavaApplication2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int base;
        int exponente;
        int resultado;
        
        System.out.println("ingrese la base");
        base=sc.nextInt();
        System.out.println("ingrese el exponente");
        exponente=sc.nextInt();
        
        resultado=elevar(base,exponente);
        
        System.out.println(base+" elevado a la "+exponente+" es= "+resultado);
    }
    
    public static int elevar(int base,int exponente)
    {
        if(exponente==1)
            return base;
        
        return base*elevar(base,exponente-1);
        
    }
           
    
    
    
}
