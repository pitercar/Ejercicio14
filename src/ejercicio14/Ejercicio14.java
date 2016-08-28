/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;
import java.util.*;

/**
 *
 * @author Piter
 */
public class Ejercicio14 {
    
    private double circulo, triangulo, cuadrado, rectangulo;
    
    public void cargarDatos(){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Escoja una figura geometrica... ");
        System.out.println("1. Area del circulo");        
        System.out.println("2. Area del triangulo");        
        System.out.println("3. Area del cuadrado");        
        System.out.println("4. Area del rectangulo");
        
        int figura=entrada.nextInt();
        
        switch (figura){
       
           case 1:
               System.out.println("pi x R cuadrado ");
               int radio=entrada.nextInt();
               System.out.println("El area del circulo es "+radio);
               break; 
               
           case 2:
               System.out.println("b x a sobre 2 ");
               break; 
               
           case 3:
               System.out.println("l x l ");
               break; 
               
           case 4:
               System.out.println("b x a ");
               break;        
        
            default: 	
		System.out.println("La opción no es correcta ");
        }
    }
    
    public void dondeVoy(){
        System.out.println("Aqui voy creando clases....");
       
   }
}
