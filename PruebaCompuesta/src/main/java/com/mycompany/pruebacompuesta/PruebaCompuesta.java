

package com.mycompany.pruebacompuesta;


import java.util.Scanner;

public class PruebaCompuesta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Introduzca un valor entero: ");
            numero = entrada.nextInt();
            
            if (numero > 0) {
                System.out.println(numero + " es mayor que cero");
                System.out.println("Pruebe de nuevo introduciendo un número negativo");
            } else if (numero < 0) {
                System.out.println(numero + " es menor que cero");
                System.out.println("Pruebe de nuevo introduciendo un número positivo");
            } else {
                System.out.println(numero + " es igual a cero");
                System.out.println("¿Por qué no introduce un número negativo?");
            }
        } while (numero >= 0);
    }

}

