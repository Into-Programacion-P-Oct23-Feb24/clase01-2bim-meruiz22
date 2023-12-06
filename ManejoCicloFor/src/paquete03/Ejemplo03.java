/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {
    /*Generar una solución que permita ingresar jugadores de fútbol; por cada 
    jugador se debe solicitar:
- Nombre el jugador
- Posición en el campo de juego
- Edad
- Estatura
El número de veces que se debe iterar (ingresar información), se debe ingresar 
    previamente por teclado.
Se debe imprimir el siguiente reporte (usar una cadena de acumulación), como 
    ejemplo. En este caso se decidió ingresar 5 jugadores:
Listado de Jugadores
1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
4. Ángel Mena -Delantero-, edad 32, estatura 1.75
5. Michael Estrada -Delantero-, edad 27, estatura 1.93
    
    */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        String listado= "Listadon de Jugadores";
        int edad;
        double estatura;
        int limite;
        int contador=0; 
        System.out.println("Ingrese el numero de jugadores que desea listar");
        limite=entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i <limite; i++) {
            System.out.println("Ingrese el nombre del jugador: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            contador = contador +1;
            
            listado= String.format("%s\n %d. %s -%s-, edad %d, estatura %.2f\n",
                    listado,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            
        }
        System.out.printf("%s\n", listado);
    }
}
