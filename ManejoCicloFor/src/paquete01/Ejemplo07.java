/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {
    public static void main(String[] args) {
        int operacion;
        String mensajeFinal = ""; // Cadena acumuladora inicializada
        for (int i = 1; i <= 10; i++) { // for 01
            // System.out.printf("Tabla de multiplicar del número %d\n", i);
            mensajeFinal = String.format("%sTabla de multiplicar del número %d\n", 
                    mensajeFinal, i);
            // Se agregan datos a la variable acumuladora y esta los almacena
            for (int contador = 1; contador <= 12; contador++) {
                operacion = i * contador;
                // System.out.printf("%d x %d = %d\n", i, contador, operacion);
                mensajeFinal = String.format("%s %d x %d =%d\n", 
                mensajeFinal,
                i,
                contador,
                operacion);
                // Se agregan datos del ciclo a la variable acumuladora y esta los almacena
            }
            // System.out.println("\n");
            mensajeFinal = String.format("%s\n", mensajeFinal);
        } // termina for 01
        
        System.out.printf("%s\n", mensajeFinal);
        // Se presenta la cadena 
    }
}
