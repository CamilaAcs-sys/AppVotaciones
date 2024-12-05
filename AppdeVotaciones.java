/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appdevotaciones;

import java.util.Scanner;
/**
 *
 * @author CAMILA
 */
public class AppdeVotaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("________ Bienvenido a VotaApp_______");
        System.out.println("");
        System.out.print("Digite su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Digite su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Digite su nacionalidad : \nSi es colombiano ingrese (colombiano) ");
        String nacionalidad = scanner.next();

        System.out.print("Se ha registrado para votar? \n Digite (true) si se ha registrado \n Digite (false) si no se ha registrado: ");
        boolean registrado = scanner.nextBoolean();

        if (edad >= 18 && nacionalidad.equalsIgnoreCase("colombiano") && registrado) {
            
            System.out.println("");
            System.out.println("\nCiudadano " +  nombre + ", usted ha sido habilitado para votar.");
            
        } else {
            System.out.println("");
            System.out.println("______ERROR______\nCiudadano" + nombre + ", usted no ha sido habilitado para votar.");
        }
        
    }
    
}
