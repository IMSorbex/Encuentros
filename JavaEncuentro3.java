/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaej;

import java.util.Scanner;

/**
 *
 * @author Daiyerson
 */
public class JavaGuiaEj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        int num;
        int num2;
        int resultado;
        boolean test;
        short corto;
        long largo;
        double decimal;
        float decimal2;
        byte bit;
        char caracter;
        
        name = "Jose";
        num = 25;
        num2 = 3;
        test = true;
        corto = 32767;
        largo = 2000000000;
        decimal = 2.5;
        decimal2 = 15.32f;
        bit = 127;
        caracter = 'A';
        
        resultado = num + num2;
        System.out.println(resultado);
        resultado = num - num2;
        System.out.println(resultado);
        resultado = num * num2;
        System.out.println(resultado);
        resultado = num / num2;
        System.out.println(resultado);
    }
}