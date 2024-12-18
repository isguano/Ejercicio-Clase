
package com.mycompany.selva;

import java.util.Scanner;

//revisado por Stiven Guano
public class Selva {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        String respuesta;
        
        do{
        System.out.println("Ingresa sobre que animal quiere saber:");
        System.out.println("1. Mamifero");
        System.out.println("2. Ave");
        System.out.println("3. Reptil");
        System.out.println("Ingrese su opcion: ");
        opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch(opcion){
               
        
            case 1:
                //Mamifero
                Mamifero mamifero = new Mamifero("", "", 0);
                mamifero.DatosM(scanner);
                mamifero.comer();
                mamifero.AmamantarCrias();
                mamifero.dormir();
                break; 
                
            case 2:
                 //Aves
                 Ave ave = new Ave(0, "", 0);
                 ave.DatosA(scanner);
                 ave.comer();
                 ave.Volar();
                 ave.dormir();
                 break;
                  
            case 3:
                //reptil
                 Reptil reptil = new Reptil( "", "", 0);
                 reptil.DatosR(scanner);
                 reptil.comer();
                 reptil.arrastrarse();
                 reptil.dormir();
                 break;
                
            default:
                 System.out.println("Opcion no valida");
                 break;
              }
        
        System.out.println("Desea hacer sobre otro animal? (si/no)");   
        respuesta = scanner.nextLine().toLowerCase();
        
        }while(respuesta.equals("si"));
        
        System.out.println("Gracias, hasta luego ");
   }    
   
   
}
