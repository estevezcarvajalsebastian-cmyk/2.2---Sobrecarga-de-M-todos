/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Sebastian Estevez
 */
public class Prueba {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        // Operaciones con 2 números
        System.out.println("Suma de 2 numeros: " + calculadora.sumar(10, 5));
        System.out.println("Resta de 2 numeros: " + calculadora.restar(10, 5));
        System.out.println("Multiplicación de 2 numeros: " + calculadora.multiplicar(10, 5));
        System.out.println("División de 2 numeros: " + calculadora.dividir(10, 5));

        // Operaciones con 3 números
        System.out.println("Suma de 3 numeros: " + calculadora.sumar(10, 5, 2));
        System.out.println("Resta de 3 numeros: " + calculadora.restar(10, 5, 2));
        System.out.println("Multiplicación de 3 numeros: " + calculadora.multiplicar(10, 5, 2));

        // Operaciones con 4 números
        System.out.println("Suma de 4 numeros: " + calculadora.sumar(10, 5, 2, 3));
        System.out.println("Resta de 4 numeros: " + calculadora.restar(10, 5, 2, 3));
        System.out.println("Multiplicación de 4 numeros: " + calculadora.multiplicar(10, 5, 2, 3));
    }
}