/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selva;

import java.util.Scanner;

/**
 *
 * @author rb940
 */
public class Reptil extends Animal{
    
    public String Escamas;

    public Reptil(String Escamas, String Nombre, int edad) {
        super(Nombre, edad);
        this.Escamas = Escamas;
    }

     public void DatosR(Scanner scanner){
        System.out.println("Ingrese los datos del reptil");
        System.out.println("Ingrese el nombre del reptil: ");
        String Nombre = scanner.nextLine();
        
        System.out.println("Infrese la edad del reptil: ");
        int edad = scanner.nextInt();
        scanner.nextLine();//sin limpiar el buffer, salta directamente a los resultados, pilas con eso
        
        System.out.println("Ingrese el tipo de escamas del reptil: ");
        String Escamas = scanner.nextLine();
        
        
        //Asignar los datos al objeto
        super.Nombre=Nombre;
        this.Escamas = Escamas;
        super.edad=edad;
        
    
    }
    
    public void arrastrarse(){
        System.out.println(Nombre + "se arrastra con sus escamas de tipo" + Escamas);
    }
    
   
}
