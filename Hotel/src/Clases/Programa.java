
package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Programa {
     public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        String tipo;
        String genero;
        int edad;
        

        System.out.println("Ingresa tipo de habitacion(sencilla,doble,matrimonial,suite), genero(H,M) y edad: ");
        tipo = entrada.readLine(); 
        genero =  entrada.readLine();
        edad =  Integer.parseInt (entrada.readLine());

        Habitacion H =new Habitacion(tipo,genero, edad);
        int preciofinal;
        
        preciofinal= H.getPrecioHabitacion();
        System.out.println("El precio de su habitacion es: " + preciofinal );
    }
}

